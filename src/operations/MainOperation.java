package operations;

import operations.logAnalyze.inputOperation;
import operations.logAnalyze.printMenuOperation;

public class MainOperation {
    public static void main(String []args) {
        //log Analyzer part
        //call to print menu operation
        printMenuOperation menu=new printMenuOperation();
        menu.printMenu();

        //switch in input
        inputOperation input=new inputOperation();
        input.checkInput();

        //Email manage part

        //call to exit

    }
}
