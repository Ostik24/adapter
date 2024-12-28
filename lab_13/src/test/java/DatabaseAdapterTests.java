import org.junit.jupiter.api.Test;

import ucu.edu.ua.DatabaseAdapter;
import ucu.edu.ua.БазаДаних;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseAdapterTests {

    @Test
    public void testDatabaseAdapter() {
        БазаДаних legacyDb = new БазаДаних();
        DatabaseAdapter adapter = new DatabaseAdapter(legacyDb);

        assertEquals("Ukrainian User Data", adapter.getUserData());
        assertEquals("Ukrainian Statistics", adapter.getStatistics());
    }
}