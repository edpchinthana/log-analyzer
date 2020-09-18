package input;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CommandLineInput implements Input{

    final Scanner scanner;
    public CommandLineInput(){
        this.scanner=new Scanner(System.in);
    }

    public String readFilePath(){
            try {
                String path = scanner.nextLine();
                String regularExpression = "([a-zA-Z]:)?(\\[a-zA-Z0-9_-]+)+\\?";
                boolean isMatched = Pattern.matches(regularExpression,path);
                if(isMatched){
                    return path;
                }else {
                    throw new InputMismatchException();
                }

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
            String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
            if(email.matches(regex)){
                return  email;
            }

            else {
                throw new InputMismatchException();
            }

        }catch(InputMismatchException ex3){
            throw ex3;
        }
    }

    public int readMenuItem(int number){
        try {
            int item = scanner.nextInt();
            if(item >0 && item<number) {
                return item;
            }else{
                throw new InputMismatchException();
            }
        }catch(InputMismatchException ex4){
            throw ex4;
        }
    }







}


