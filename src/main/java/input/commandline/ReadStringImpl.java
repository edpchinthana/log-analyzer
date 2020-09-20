package input.commandline;

import java.util.Scanner;

public class ReadStringImpl implements ReadString {
    @Override
    public String perform() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
