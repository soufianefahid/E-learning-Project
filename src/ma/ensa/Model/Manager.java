package ma.ensa.Model.DaoImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Azedine on 24/04/2016.
 */

public class Manager {
    private static EntityManager entityManager;

    private Manager() {

    }

    public static EntityManager getInstance(){
        if(entityManager ==null){
            entityManager = Persistence.createEntityManagerFactory("Eclipselink_JPA").createEntityManager();
        }
        return entityManager;
    }
}
