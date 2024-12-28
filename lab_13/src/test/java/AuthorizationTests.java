import org.junit.jupiter.api.Test;

import ucu.edu.ua.Authorization;
import ucu.edu.ua.DatabaseAdapter;
import ucu.edu.ua.БазаДаних;

import static org.junit.jupiter.api.Assertions.*;

public class AuthorizationTests {

    @Test
    public void testAuthorization() {
        БазаДаних legacyDb = new БазаДаних();
        DatabaseAdapter adapter = new DatabaseAdapter(legacyDb);

        Authorization authorization = new Authorization();
        assertTrue(authorization.authorize(adapter));
    }
}