package input;

import java.util.Scanner;

public class CommandLineInput implements Input{

    final Scanner scanner;
    public CommandLineInput(){
        this.scanner=new Scanner(System.in);
    }

    public String readFilePath(){
            String path=scanner.nextLine();
            return path;
    }


    public String readName(){
        String name=scanner.nextLine();
        return name;

    }

    public String readEmail(){
        String email=scanner.nextLine();
        return email;

    }








}


