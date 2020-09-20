package output.commandline;

import models.Email;

import java.util.List;

public class ViewEmailsImpl implements ViewEmails {

    @Override
    public void perform(List<Email> emailList) {
        for(Email email: emailList){
            System.out.println(" "+email.getId()+" "+email.getName()+" "+email.getEmail_address());
        }
    }
}
