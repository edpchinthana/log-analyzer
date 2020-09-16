package output;

public class EmailMenu implements Output {

    public void print(String... prms) {

        final int menuNumber = 3;

        System.out.println("---------- Emails ----------");
        System.out.println("1. View emails");
        System.out.println("2. Add emails");
        System.out.println("3. Delete emails");

        System.out.println("Which option do you want to proceed?");

    }

}
