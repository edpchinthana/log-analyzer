package operations.mainmenu;

import operations.email.ManageEmailRepository;
import operations.loganalyzer.AnalyzeLogFile;

public class MainMenuOperationFactory {

    public MainMenuOperation getInstance(int menuSelector) {
        MainMenuOperation operation = null;
        switch (menuSelector){
            case 1:
                operation = new AnalyzeLogFile();
                break;
            case 2:
                operation = new ManageEmailRepository();
                break;
            case 3:
                System.exit(0);
                break;
        }
        return operation;
    }
}
