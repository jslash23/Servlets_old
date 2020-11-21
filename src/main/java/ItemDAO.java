import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.IOException;


public class ItemDAO {
    MyServlet myServlet = new MyServlet();

    public Item doGet() {
        return null;
    }

    public void save(Item item) throws IOException {

        try (Session session = createSessionFactory().openSession()) {

            Transaction transaction = session.getTransaction();
            transaction.begin();
            //action
            session.save(item);
            transaction.commit();
            System.out.println("Save Item done ");
            //throw new IOException();
        }

        catch (HibernateException e /*IOException e*/) {
            System.err.println();

            e.printStackTrace();
            System.err.println("!!!!!!!" +
                    "cath worked " + "Save Item failed!!!" + e.getMessage());
        }
    }



    public Item doPut() {
        return null;
    }

    public Item doDelete() {
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
