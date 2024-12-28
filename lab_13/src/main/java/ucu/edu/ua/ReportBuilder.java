package ucu.edu.ua;

public class ReportBuilder {
    private final Database db;

    public ReportBuilder(Database db) {
        this.db = db;
    }

    public void generateReport() {
        System.out.println("Generating report with statistics: " + db.getStatistics());
    }
}