package input.commandline;

import java.util.InputMismatchException;

public class ReadMenuItem extends CommandLineInput{
    public int perform(int maxNoOfItems) {
        try {
            int item = scanner.nextInt();
            if(item >0 && item<=maxNoOfItems) {
                return item;
            }else{
                throw new InputMismatchException();
            }
        }catch(InputMismatchException ex4){
            throw ex4;
        }
    }
}
