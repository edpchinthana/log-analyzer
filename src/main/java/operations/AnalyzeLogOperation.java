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

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class AnalyzeLogOperation implements  Operation {
    @Override
    public void execute(ConfigurationModel configurationModel) throws ParseException, IOException {
        Output output = new CommandLineOutput();
        Input input = new CommandLineInput();
        LogRepository logRepository = new LogFileReader();
        EmailRepository emailRepository = new MysqlEmailRepository();
        EmailSender emailSender = new GmailSMTP();
        ConfigurationRepository configurationRepository = new ConfigurationRepositoryImpl();

        output.showMessage("---Analyze log file---");
        output.showMessage("Enter log file path : ");

        String filePath = input.readString();
        LogReport logReport = logRepository.getLogReport(filePath, configurationModel.getLastTimestamp());
        List<Email> emailList = emailRepository.getEmails(configurationModel.getDatabaseConfiguration());
        output.showSummary(logReport);
        emailSender.sendEmails(emailList,logReport,configurationModel.getEmailSenderConfiguration());
        configurationModel.setLastTimestamp(logReport.getLastTimestampStr());
        configurationRepository.exportConfiguration(configurationModel);
        System.out.println("--bye--");
        System.exit(0);
    }
}
