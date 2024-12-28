package ucu.edu.ua;

public class DatabaseAdapter implements Database {
    private final БазаДаних db;

    public DatabaseAdapter(БазаДаних db) {
        this.db = db;
    }

    @Override
    public String getUserData() {
        return db.отриматиДаніКористувача();
    }

    @Override
    public String getStatistics() {
        return db.отриматиСтатистичніДані();
    }
}