package input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CommandLineInput implements Input{

    final Scanner scanner;
    public CommandLineInput(){
        this.scanner=new Scanner(System.in);
    }

    public String readFilePath(){
            try {
                String path = scanner.nextLine();
                return path;
            } catch (InputMismatchException ex1) {
                throw ex1;
            }
    }


    public String readName(){
            try {
                String name = scanner.nextLine();
                return name;
            }catch(InputMismatchException ex2){
                    throw ex2;
                }
    }

    public String readEmail(){
        try {
            String email = scanner.nextLine();
            return email;
        }catch(InputMismatchException ex3){
            throw ex3;
        }
    }

    public int readMenuItem(int number){
        try {
            int item = scanner.nextInt();
            if(item >0 && item<number) {
                return item;
            }
        }catch(InputMismatchException ex4){
            throw ex4;
        }
        return 0;
    }







}


