package input.commandline;

import input.Input;

public class CommandLineInput implements Input {
    @Override
    public String readString() {
        ReadString readString = new ReadStringImpl();
        return  readString.perform();
    }

    @Override
    public int readNumber() {
        ReadNumber readNumber = new ReadNumberImpl();
        return readNumber.perform();
    }
}
