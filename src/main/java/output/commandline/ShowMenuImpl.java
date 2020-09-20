package output.commandline;

public class ShowMenuImpl implements ShowMenu{
    @Override
    public void perform() {
        System.out.println("\n----------------Menu---------------");
        System.out.println("  1 - Analyze Log");
        System.out.println("  2 - View email addresses");
        System.out.println("  3 - Add email address");
        System.out.println("  4 - Delete email address");
        System.out.println("  5 - Exit");
        System.out.println("-----------------------------------\n");
        System.out.print("Enter your choice : ");
    }
}