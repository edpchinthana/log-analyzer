import emailRepository.EmailRepository;
import emailRepository.mysql.MysqlEmailRepository;
import emailsender.EmailSender;
import emailsender.gmail.GmailSMTP;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import models.Email;
import operations.mainmenu.MainMenuOperationsHandler;

public class Main {

    public static void main(String[] args) {
        MainMenuOperationsHandler mainMenuOperationsHandler = new MainMenuOperationsHandler();
        while (true){
            mainMenuOperationsHandler.runApplication();
        }
    }
}