package output.commandline;

public class HelpMenu{

    int menuNumber = 4;

    public void perform() {


        System.out.println("------------------------------ Help Menu ------------------------------");
        System.out.println("        1. Analyze Log");
        System.out.println("        2. Display Summary");
        System.out.println("        3. Emails");
        System.out.println("        4. Exit");

        System.out.println("Which option do you want to proceed?");

    }
   public int getNumber() {

       return this.menuNumber;
    }

    public void setNumber(int menuNum) {

        this.menuNumber = menuNum;
    }
}
