package operations.loganalyzer;

import operations.email.operationRepository;
import operations.exit.UserExit;
import output.Filepath;
import output.Summary;
import output.EmailMenu;



public class InputOperation {

    public String checkInput(){

        //call to get user input
        CommandLineInput item=new CommandLineInput();
        int fact= item.readMenuItem();


        switch (fact){

            case 1:
                //get file path and pass
                FilePath path= new FilePath();
                path.print();
                //get list from package log repo
                getlistoferror errormsg=new gerlistoferror();
                errormsg.method-name();
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
                 return s;


                //choose one option
                if(s.equals("a")){
                    addEmailOperation addemail=new addEmailOperation();
                    addemail.add();
                }else if(s.equals("b")){
                    deletEmailOperation deletemail=new deletEmailOperation();
                    deletemail.delete();
                }else{
                    getEmailOperation getEmail=new getEmailOperation();
                    getEmail.get();
                }*/
                break;

            default:
                //save current timestamp in the text file-overwrite
                //exit from the application call user exit
                UserExit obj=new UserExit();
                obj.appExit();
                break;
        }
        return null;
    }
}
