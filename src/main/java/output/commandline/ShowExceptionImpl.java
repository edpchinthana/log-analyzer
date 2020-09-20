package output.commandline;

public class ShowExceptionImpl implements ShowException {
    @Override
    public void perform(String message) {
        System.out.println("\n-----Exception Occured-----");
        System.out.println(" "+message);
    }
}