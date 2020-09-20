package emailRepository.mysql;

import models.Email;
import org.junit.Test;
import static org.mockito.Mockito.mock;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class AddEmailTest {
    AddEmail addEmail=new AddEmail();

    @Test
    public void test_add_email() {
        Email email=mock(Email.class);
        addEmail.perform(email);
    }
}
