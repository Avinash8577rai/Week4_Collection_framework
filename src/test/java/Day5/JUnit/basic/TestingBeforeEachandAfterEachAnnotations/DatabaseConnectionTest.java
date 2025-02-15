package Day5.JUnit.basic.TestingBeforeEachandAfterEachAnnotations;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class DatabaseConnectionTest {
    private DatabaseConnection databaseConnection;

    @BeforeEach
    void setup(){
        databaseConnection= new DatabaseConnection();
        databaseConnection.connect();

    }
    @AfterEach
    void tearDown(){
        databaseConnection.disconnect();
    }
    @Test
    void testConnectionEstblished(){
        assertTrue(databaseConnection.isConnected());
    }
    @Test
    void testConnectionIsClosed(){
        databaseConnection.disconnect();
        assertFalse(databaseConnection.isConnected());
    }
}
