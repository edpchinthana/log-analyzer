package operations;

public class OperationFactory {
    public Operation getInstance(int selector){
        Operation operation = null;
        switch (selector){
            case 1:
                operation = new AnalyzeLogOperation();
                break;
            case 2:
                operation = new ViewEmailsOperation();
                break;
            case 3:
                operation = new AddEmailOperation();
                break;
            case 4:
                operation = new DeleteEmailOperation();
                break;
            default:
                operation = new ExitOperation();
                break;
        }
        return operation;
    }
}
