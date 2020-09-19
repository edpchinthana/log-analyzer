package operations.email;

import emailRepository.mysql.MysqlEmailRepository;

public class ViewEmailOperation {

    public void view(){
        MysqlEmailRepository view=new MysqlEmailRepository();
        view.getEmails();
    }
}
