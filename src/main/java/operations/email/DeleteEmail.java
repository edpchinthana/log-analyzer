package operations.email;

import emailRepository.EmailRepository;
import emailRepository.mysql.MysqlEmailRepository;
import input.Input;
import input.commandline.CommandLineInput;
import models.Email;

import java.util.Scanner;

public class DeleteEmail implements EmailMenuOperation{

    @Override
    public void execute() {
        EmailRepository emailRepository = new MysqlEmailRepository();

        System.out.println("Enter user id :");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        emailRepository.deleteEmail(id);
    }
}
