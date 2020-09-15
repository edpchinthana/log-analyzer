package output;

public class EmailMenu implements Output {

    public void print() {

        System.out.println("---------- Emails ----------");
        System.out.println("a. View emails");
        System.out.println("b. Add emails");
        System.out.println("c. Delete emails");

    }

}
