package operations.loganalyzer;

import input.commandline.CommandLineInput;
import operations.email.operationRepository;
import operations.exit.UserExit;
import output.commandline.FilePath;
import output.commandline.Summary;
import output.commandline.HelpMenu;


public class InputOperation{

    public int checkInput(){

       
        CommandLineInput item=new CommandLineInput();
        int fact= item.readMenuItem(this.menuNumber);


        switch (fact){

            case 1:
                //get file path and pass
                FilePath path= new FilePath();
                path.print();
                //get list from package log repo
               // getlistoferror errormsg=new gerlistoferror();
                //errormsg.method-name();
                //pass error list emialrepo
                break;

            case 2:

                //get summary details  from log repo error,info,warn
               // summaryclass logsum = new summaryclass();
             //logsum.summarymethod();


                //displaysummary
                Summary summary=new Summary();
                summary.print();    //pass parameter
                break;

            case 3:

                //call email menu from output package
                operationRepository emailmenu= new operationRepository();
                emailmenu.divideSections();

                //get user input as 1,2,3
                /*
                emailuserinputclass chose=new emailuserinputclass();
                 String s=chose.methodn();
                 return s;*/
                break;

            default:
                //for exit from the application call user exit class
                UserExit obj=new UserExit();
                obj.appExit();
                break;
        }
        return null;
    }
}