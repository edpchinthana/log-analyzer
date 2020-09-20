package output.commandline;

import models.Email;

import java.util.List;

public interface ViewEmails {
    void perform(List<Email> emailList);
}
