package operations.email;

public class EmailMenuOperationFactory {
    public EmailMenuOperation getInstance(int menuSelector) {
        EmailMenuOperation operation = null;
        switch (menuSelector){
            case 1:
                operation = new ViewEmails();
                break;
            case 2:
                operation = new AddEmail();

                break;
            case 3:
                operation = new DeleteEmail();
                break;
            case 4:
                operation = new ExitFromEmailMenu();
                break;
        }
        return operation;
    }
}
