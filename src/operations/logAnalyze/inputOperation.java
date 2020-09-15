package operations.logAnalyze;

import operations.exit.userExit;
import input.#;

public class inputOperation {

    public static void checkInput(){

        //call to get user input
        CommandLineInput item=new CommandLineInput();
        int fact= item.readMenuItem();

        switch (fact){
            case 1:
                askpathoutput path= new askpathoutput();    //get file path and pass
                path.methodname();
                //get list & pass to email
                getlistoferror errormsg=new gerlistoferror();

                break;
            case 2:
                //displaysummary
                break;
            case 3:
                //call email menu from output package
                askemailmenu emailmenu= new askmailmenu();
                emailmenu.methodmeilmenu();
                break;
            default:
                //exit from the application call user exit
                userExit obj=new userexit();
                obj.appExit();
                break;
        }
    }
}
