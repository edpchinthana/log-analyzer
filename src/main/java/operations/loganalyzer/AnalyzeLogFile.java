package operations.loganalyzer;

import configurationsRepository.PreviousLastTimeStamp;
import configurationsRepository.PreviousLastTimeStampImpl;
import emailRepository.EmailRepository;
import emailRepository.mysql.MysqlEmailRepository;
import emailsender.EmailSender;
import emailsender.gmail.GmailSMTP;
import input.Input;
import input.commandline.CommandLineInput;
import logRepository.LogAnalyzer;
import logRepository.LogRepository;
import logRepository.LogRepositoryImpl;
import models.Email;
import models.LogLine;
import operations.mainmenu.MainMenuOperation;
import output.Output;
import output.commandline.CommandlineUserOutput;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class AnalyzeLogFile implements MainMenuOperation {
    @Override
    public void execute() throws IOException, ParseException {
        System.out.println("loganalyzer menu");
        Output output = new CommandlineUserOutput();
        Input input = new CommandLineInput();
        LogRepository logRepository = new LogRepositoryImpl();
        PreviousLastTimeStamp previousLastTimeStamp = new PreviousLastTimeStampImpl();
        LogAnalyzer logAnalyzer = new LogAnalyzer();
        EmailRepository emailRepository = new MysqlEmailRepository();
        EmailSender emailSender = new GmailSMTP();

        output.displayFilePath();
        String filePath = input.readFilePath();
        String lastTimestamp = previousLastTimeStamp.getPreviousLastTimeStamp(filePath, "src/main/java/configurationsRepository/TimeStampsRecord.txt");
        List<String> loglines = logRepository.readLogFile(filePath, lastTimestamp);
        List<LogLine> logLineList = logAnalyzer.analyzeReport(loglines);

        List<Email> emailList = emailRepository.getEmails();
        emailSender.sendEmails(emailList,loglines);

    }
}
