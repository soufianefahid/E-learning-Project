
import ma.ensa.Model.Entity.Category;
import ma.ensa.Model.Dao.CategoryDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Test {
    public  static  void main(String args[]) throws IOException {

        /*EntityManagerFactory factory= Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager em=factory.createEntityManager();


        em.getTransaction().begin();
        em.getTransaction().commit();*/

        CategoryDao categoryDao =new CategoryDao();
        categoryDao.AddCategory(new Category("Designe" , "develepment Desing ","design.pnj",new Date()));

/*        File file = new File("web/temp");

        if (file.exists()) {
            System.out.println("Le dossier existe déjà : " + file.getAbsolutePath());
        } else {
            if (file.mkdir()) {
                System.out.println("Ajout du dossier : " + file.getAbsolutePath());
            } else {
                System.out.println("Echec sur le dossier : " + file.getAbsolutePath());
            }
        } */
    }

    }

