package ucu.edu.ua;

public class Main {
    public static void main(String[] args) {
        // Legacy Ukrainian database
        БазаДаних db = new БазаДаних();
        DatabaseAdapter adapter = new DatabaseAdapter(db);

        // Authorization
        Authorization authorization = new Authorization();
        if (authorization.authorize(adapter)) {
            // Generate report
            ReportBuilder reportBuilder = new ReportBuilder(adapter);
            reportBuilder.generateReport();
        }
    }
}