package peaksoft.config;

import jakarta.persistence.EntityManager;
import org.hibernate.cfg.Configuration;
import peaksoft.entity.Instructor;
import peaksoft.entity.Student;

import java.util.Properties;

public class HibernateConfig {
    public static EntityManager getEntityManager() {
        Configuration configuration = new Configuration();
        Properties prop = new Properties();
        prop.setProperty("connection.driver_class", "com.postgresql.Driver");
        prop.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5433/exam_task_hibernate");
        prop.setProperty("hibernate.connection.username", "postgres");
        prop.setProperty("hibernate.connection.password", "postgres");
        prop.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        prop.setProperty("hibernate.show_sql", "true");
        prop.setProperty("hibernate.hbm2ddl.auto", "create");
        prop.setProperty("hibernate.current_session_context_class", "thread");
        configuration.setProperties(prop);
        configuration.addAnnotatedClass(Instructor.class);
        configuration.addAnnotatedClass(Student.class);
        return configuration.buildSessionFactory().createEntityManager();

    }

}
