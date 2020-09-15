package operations.logAnalyze;

import operations.exit.userExit;
import input.#;

import java.awt.*;
import java.util.List;#;

public class inputOperation {

    public static void checkInput(){

        //call to get user input
        CommandLineInput item=new CommandLineInput();
        int fact= item.readMenuItem();

        switch (fact){
            case 1:
                askpathoutput path= new askpathoutput();    //get file path and pass
                path.methodname();
                //get list
                getlistoferror errormsg=new gerlistoferror();
                errormsg.method-name();
                //pass error list

                break;
            case 2:
                //get summary details  from log repo error,info,warn
             //   List<Integer> numbers=numberRepository.read();

                //displaysummary

                calldisplaysummaryclass summary=new calldisplaysummaryclass();

                summary.methodisplaysum( error,info, warns);
                break;
            case 3:
                //call email menu from output package
                askemailmenu emailmenu= new askmailmenu();
                emailmenu.methodmeilmenu();
                //get user input as a- b- c-
                emailuserinputclass chose=new emailuserinputclass();
                 String s=chose.methodn();
                //choose one option
                if(s.equals("a")){

                }else if(s.equals("b")){

                }else{

                }
                break;
            default:
                //exit from the application call user exit
                userExit obj=new userexit();
                obj.appExit();
                break;
        }
    }
}
