package operations;

import operations.loganalyzer.InputOperation;
import operations.loganalyzer.PrintMenuOperation;

public class MainOperation {
    public static void main(String []args) {

        while() {
            //log Analyzer part

            //call to print menu operation
            PrintMenuOperation menu = new PrintMenuOperation();
            menu.printMenu();

            //switch in input
            InputOperation input = new InputOperation();
            input.checkInput();

            //email

            //Email manage part

            //call to exit
        }
    }
}
