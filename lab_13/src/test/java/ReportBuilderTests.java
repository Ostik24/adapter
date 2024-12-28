import org.junit.jupiter.api.Test;

import ucu.edu.ua.DatabaseAdapter;
import ucu.edu.ua.ReportBuilder;
import ucu.edu.ua.БазаДаних;

public class ReportBuilderTests {

    @Test
    public void testReportBuilder() {
        БазаДаних legacyDb = new БазаДаних();
        DatabaseAdapter adapter = new DatabaseAdapter(legacyDb);

        ReportBuilder reportBuilder = new ReportBuilder(adapter);
        reportBuilder.generateReport();
    }
}