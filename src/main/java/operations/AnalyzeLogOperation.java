package operations;

import configurations.ConfigurationRepository;
import configurations.impl.ConfigurationRepositoryImpl;
import emailrepository.EmailRepository;
import emailrepository.mysql.MysqlEmailRepository;
import emailsender.EmailSender;
import emailsender.gmail.GmailSMTP;
import input.Input;
import input.commandline.CommandLineInput;
import logrepository.LogRepository;
import logrepository.filereader.LogFileReader;
import models.ConfigurationModel;
import models.Email;
import models.LogReport;
import output.Output;
import output.commandline.CommandLineOutput;
import utils.TimestampConvertor;
import utils.TimestampConvertorImpl;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class AnalyzeLogOperation implements  Operation {
    Output output = new CommandLineOutput();
    Input input = new CommandLineInput();
    LogRepository logRepository = new LogFileReader();
    EmailRepository emailRepository = new MysqlEmailRepository();
    EmailSender emailSender = new GmailSMTP();
    ConfigurationRepository configurationRepository = new ConfigurationRepositoryImpl();
    TimestampConvertor convertor = new TimestampConvertorImpl();

    @Override
    public void execute(ConfigurationModel configurationModel) throws ParseException, IOException {

        output.showMessage("---Analyze log file---");
        output.showMessage("Enter log file path : ");

        String filePath = input.readString();

        LogReport logReport = logRepository.getLogReport(filePath, convertor.stringToTimestamp(configurationModel.getLastTimestamp()));
        List<Email> emailList = emailRepository.getEmails(configurationModel.getDatabaseConfiguration());

        output.showSummary(logReport);

        if(emailList.size()==0){
            output.showMessage("No email addresses in the database");
        }else{
            emailSender.sendEmails(emailList,logReport,configurationModel.getEmailSenderConfiguration());
            configurationModel.setLastTimestamp(logReport.getLastTimestampStrForConfiguration());
            configurationRepository.exportConfiguration(configurationModel);
            System.out.println("--bye--");
            System.exit(0);
        }


    }
}
