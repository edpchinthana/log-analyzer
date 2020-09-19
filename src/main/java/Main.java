

import input.Input;
import input.commandlineInput.CommandLineInput;

public class Main {

    public static void main(String[] args) {
        Input input = new CommandLineInput();
        System.out.println("email");
        String email = input.readEmail();
        System.out.println(email);
    }
}