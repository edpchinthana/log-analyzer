package input.commandlineInput;

import input.Input;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CommandLineInput implements Input {

    final Scanner scanner;
    public CommandLineInput(){
        this.scanner=new Scanner(System.in);
    }

    public String readFilePath(){
           ReadFilePath readFilePath = new ReadFilePath();
           return  readFilePath.perform();
    }

    public String readName(){
        ReadName readName = new ReadName();
        return readName.perform();
    }

    public String readEmail(){
        ReadEmail readEmail = new ReadEmail();
        return readEmail.perform();
    }

    public int readMenuItem(int maxNoOfItems){
        ReadMenuItem readMenuItem = new ReadMenuItem();
        return readMenuItem.perform(maxNoOfItems);
    }

}


