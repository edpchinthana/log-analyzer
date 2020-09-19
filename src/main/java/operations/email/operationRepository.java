package operations.email;

import input.commandline.CommandLineInput;

public class operationRepository {
    public void divideSections(){

        //get s from inputOperation class checkinut case 3
        CommandLineInput item=new CommandLineInput();
        int n= item.readMenuItem();

        //choose one option

        if(n==1){
            ViewEmailOperation getEmail=new ViewEmailOperation();
            getEmail.view();
        }else if(n==2){
            AddEmailOperation addemail=new AddEmailOperation();
            addemail.add();
        }else{
            DeletEmailOperation deletemail=new DeletEmailOperation();
            deletemail.delete();
        }
    }
}
