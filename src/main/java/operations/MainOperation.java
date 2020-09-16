package operations;

import operations.logAnalyze.inputOperation;
import operations.logAnalyze.printMenuOperation;

public class MainOperation {
    public static void main(String []args) {

        while() {
            //log Analyzer part

            //call to print menu operation
            printMenuOperation menu = new printMenuOperation();
            menu.printMenu();

            //switch in input
            inputOperation input = new inputOperation();
            input.checkInput();

            //email

            //Email manage part

            //call to exit
        }
    }
}
