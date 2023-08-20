package util;

import javax.security.auth.Subject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.BookEntity;
import entity.LaptopEntity;
import entity.StudentEntity;
import entity.SubjectEntity;


public class SessionFactoryConfiguartion {
    private static SessionFactoryConfiguartion sessionFactoryConfiguartion;

    private SessionFactory sessionFactory;

    private SessionFactoryConfiguartion(){
        Configuration configuration = new Configuration().configure()
        .addAnnotatedClass(StudentEntity.class)
        .addAnnotatedClass(LaptopEntity.class)
        .addAnnotatedClass(BookEntity.class)
        .addAnnotatedClass(SubjectEntity.class);
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
