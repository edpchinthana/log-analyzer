package operations.logAnalyze;

import operations.exit.userExit;

public class inputOparation {
    public static void checkInput(){
        maleeshainputclass item=new maleeshainputclass();
        item.readMenuItem();
        int fact= item;

        switch (fact){
            case 1://get file path and pass to padma
                //get list & pass pasi to email
                askpathoutput path= new askpathoutput();
                path.methodname();
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
