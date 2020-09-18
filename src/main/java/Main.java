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

public class Main {

    public static void main(String[] args) {
        EmailRepository emailRepository = new MysqlEmailRepository();
        EmailSender emailSender = new GmailSMTP();
        Scanner input = new Scanner(System.in);
        List<String> errors = new ArrayList<String>();

        for(int x = 0; x < 5; ++x) {
            errors.add("error " + x);
        }

        int x = 5;


        label34:
        while(x != 0) {
            x = input.nextInt();
            List emailList;
            switch(x) {
                case 1:
                    emailList = emailRepository.getEmails();
                    Iterator var13 = emailList.iterator();

                    while(true) {
                        if (!var13.hasNext()) {
                            continue label34;
                        }

                        Email email = (Email)var13.next();
                        PrintStream var10000 = System.out;
                        int var10001 = email.getId();
                        var10000.println(var10001 + " " + email.getName() + " " + email.getEmail_address());
                    }
                case 2:
                    String name = input.next();
                    String email = input.next();
                    Email newEmail = new Email(name, email);
                    emailRepository.addEmail(newEmail);
                    break;
                case 3:
                    int id = input.nextInt();
                    emailRepository.deleteEmail(id);
                    break;
                case 4:
                    emailList = emailRepository.getEmails();
                    Iterator var11 = emailList.iterator();

                    while(var11.hasNext()) {
                        Email email1 = (Email)var11.next();
                        System.out.println(email1.getEmail_address());
                    }

                    emailSender.sendEmails(emailList, errors);
            }
        }
    }
}