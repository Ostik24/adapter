package ucu.edu.ua;

public class Authorization {
    public boolean authorize(Database db) {
        System.out.println("Authorizing with user data: " + db.getUserData());
        return true;
    }
}
