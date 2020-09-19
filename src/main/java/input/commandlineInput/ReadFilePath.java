package input.commandlineInput;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

public class ReadFilePath extends CommandLineInput{

    public String perform(){
        String path = scanner.nextLine();
        String regularExpression = "([a-zA-Z]:)?(\\[a-zA-Z0-9_-]+)+\\?";
        boolean isMatched = Pattern.matches(regularExpression,path);
        if(isMatched){
            return path;
        }else {
            throw new InputMismatchException();
        }

    }
}
