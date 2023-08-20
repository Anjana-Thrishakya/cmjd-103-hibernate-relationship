package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SessionFactoryConfiguartion {
    private static SessionFactoryConfiguartion sessionFactoryConfiguartion;

    private SessionFactory sessionFactory;

    private SessionFactoryConfiguartion(){
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
    }

    public static SessionFactoryConfiguartion getInstance(){
        return sessionFactoryConfiguartion == null ?
        sessionFactoryConfiguartion = new SessionFactoryConfiguartion() :
        sessionFactoryConfiguartion;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }

}
