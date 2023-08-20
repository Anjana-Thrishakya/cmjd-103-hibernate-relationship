import org.hibernate.Session;

import util.SessionFactoryConfiguartion;

public class App {
    public static void main(String[] args) throws Exception {
        Session session = SessionFactoryConfiguartion.getInstance().getSession();
    }
}
