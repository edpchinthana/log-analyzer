import input.CommandLineInput;
import input.Input;

public class Main {
    public static void main(String args[]){
        Input input = new CommandLineInput();
        System.out.println("Help menu");
        try{
            int a = input.readMenuItem(4);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
