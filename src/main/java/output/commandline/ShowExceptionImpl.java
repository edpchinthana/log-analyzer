package output.commandline;

public class ShowExceptionImpl implements ShowException {
    @Override
    public void perform(Exception exception) {
        System.out.println("\n-----Exception Occured-----");
        System.out.println(" "+exception.getMessage());
    }
}