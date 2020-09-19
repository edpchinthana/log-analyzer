package input.commandlineInput;

import java.util.InputMismatchException;

public class ReadEmail extends CommandLineInput{

    public String perform(){
        try {
            String email = scanner.nextLine();
            String regex = "^[\\w-_.+]*[\\w-_.]@([\\w]+\\.)+[\\w]+[\\w]$";
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
}
