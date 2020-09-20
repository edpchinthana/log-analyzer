package output.commandline;

public class ShowMessageImpl implements ShowMessage {

    @Override
    public void perform(String message) {
        System.out.println(message);
    }
}