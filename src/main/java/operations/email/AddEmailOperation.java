package operations.email;

import emailRepository.mysql.MysqlEmailRepository;

public class AddEmailOperation {
    public void add() {
        MysqlEmailRepository email = new MysqlEmailRepository();
      email.addEmail();

    }
}
