package operations.mainmenu;

import operations.email.ManageEmailRepository;
import operations.loganalyzer.AnalyzeLogFile;
import operations.summary.DisplaySummaryRepository;

public class MainMenuOperationFactory {

    public MainMenuOperation getInstance(int menuSelector) {
        MainMenuOperation operation = null;
        switch (menuSelector){
            case 1:
                operation = new AnalyzeLogFile();
                break;
            case 2:
                operation = new DisplaySummaryRepository();
                break;
            case 3:
                operation = new ManageEmailRepository();
                break;
            case 4:
                System.exit(0);
                break;
        }
        return operation;
    }
}
