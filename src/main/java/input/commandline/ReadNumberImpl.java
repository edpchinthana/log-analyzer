package input.commandline;

import java.util.Scanner;

public class ReadNumberImpl implements ReadNumber {
    @Override
    public int perform() {
            Scanner input = new Scanner(System.in);
            return input.nextInt();
    }
}
