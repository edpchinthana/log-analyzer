package input.commandlineInput;

import java.util.InputMismatchException;

public class ReadName extends CommandLineInput {

    public String perform(){
        try {
            return scanner.nextLine();
        }catch(InputMismatchException ex2){
            throw ex2;
        }
    }
}
