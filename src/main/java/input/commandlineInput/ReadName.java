package input.commandlineInput;

import java.util.InputMismatchException;

public class ReadName extends CommandLineInput {

    public String perform(){
        try {
            String name = scanner.nextLine();
            return name;
        }catch(InputMismatchException ex2){
            throw ex2;
        }
    }
}
