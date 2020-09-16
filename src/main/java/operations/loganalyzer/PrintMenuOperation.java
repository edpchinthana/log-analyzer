package operations.loganalyzer;

import output.HelpMenu;

public class PrintMenuOperation {

    public void printMenu(){

        //call the show menu method in output package

            HelpMenu menu = new HelpMenu();
            menu.print();

        }

}
