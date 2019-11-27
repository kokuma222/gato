import java.sql.Timestamp;

public class Application {
    private Timestamp tt;
    public static void main(String[] args) {
//        System.out.println("Hello World !!!");
        Application application = new Application();
        if (application.tt == null) {
            System.out.println("NULL");
        } else {
            System.out.println("HHH");
        }

    }
}
