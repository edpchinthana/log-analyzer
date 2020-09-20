package emailRepository.mysql;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.sql.Connection;
import java.sql.Statement;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */

public class DBConnectionTest {
    @Mock
    private Connection mockConnection;
    @Mock
    private Statement mockStatement;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test_mockDB_connection() throws Exception {
        Mockito.when(mockConnection.createStatement()).thenReturn(mockStatement);
        Mockito.when(mockConnection.createStatement().executeUpdate(Mockito.any())).thenReturn(1);
        Mockito.verify(mockConnection.createStatement(), Mockito.times(1));

    }
}



