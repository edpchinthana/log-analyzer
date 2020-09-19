package output.commandline;

import output.Output;

public class EmailMenu{
    int emailMenuNumber = 3;
    public void perform() {

        System.out.println("---------- Emails ----------");
        System.out.println("1. View emails");
        System.out.println("2. Add emails");
        System.out.println("3. Delete emails");
        System.out.println("Which option do you want to proceed?");
    }
    public int getNumber() {

        return this.emailMenuNumber;
    }

    public void setNumber(int menuNum) {

        this.emailMenuNumber = menuNum;
    }
}
