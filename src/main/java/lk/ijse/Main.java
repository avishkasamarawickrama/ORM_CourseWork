package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction tx = session.beginTransaction();

        try {
            // Perform your database operations here
            tx.commit();
            // Commit the transaction
            } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
                // Rollback the transaction in case of an error
                } e.printStackTrace();
        } finally { session.close();
            // Close the session
            }
            }
    }

