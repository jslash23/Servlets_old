import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ItemDAO {

    public Item doGet(){
        return null;
    }

    public Item doPost(){
        return null;
    }

    public Item doPut(){
        return null;
    }

    public Item doDelete(){
        return null;
    }


    SessionFactory sessionFactory;


    private SessionFactory createSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = new Configuration().buildSessionFactory();
        }
        return sessionFactory;
    }
}
