package input;

import java.util.InputMismatchException;
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
            try {
                String name = scanner.nextLine();
                return name;
            }catch(InputMismatchException ex1){
                    System.out.println("You cannot enter integers");
                }
            return null;
    }

    public String readEmail(){
        try {
            String email = scanner.nextLine();
            return email;
        }catch(InputMismatchException ex2){
            System.out.println("Enter the valid Email");
        }
        return null;
    }

    public int readMenuItem(int number){
        try {
            if(number>0 && number<5) {
                int item = scanner.nextInt();
                return item;
            }
        }catch(InputMismatchException ex3){
            System.out.println("Enter the valid number");
        }
        return 0;
    }







}


