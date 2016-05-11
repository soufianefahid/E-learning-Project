package ma.ensa.Model.Dao;

import ma.ensa.Model.DaoImpl.Manager;
import ma.ensa.Model.Entity.Category;
import ma.ensa.Model.Entity.Cours;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Azedine on 25/04/2016.
 */
public class CoursDAOImpl {


    private EntityManager em= Manager.getInstance();


    public int  AddCours(Cours cours){

        try {
            em.getTransaction().begin();
            em.persist(cours);
            em.getTransaction().commit();

            return 1;

        }catch (Exception e){

            return 0;
        }

    }

    public  Category FindCategory(long ID){
        return   em.find(Cours.class,ID).getCategory();

    }


    public int UpdateCoursr(Cours cours){

        try {

            em.getTransaction().begin();
            em.merge(cours);
            em.getTransaction().commit();
            em.close();

            return   1;

        }catch (Exception e){
            return   0;
        }


    }



    public int DeleteCours(long Id){

        try{

            em.getTransaction().begin();
            em.remove(findCours(Id));
            em.getTransaction().commit();

            return 1;

        }catch (Exception e) {

            return 0;

        }
    }


    public List<Cours> findAllCours(){

        return em.createQuery("select t from Cours t ").getResultList();
    }


    public  Cours findCours(long id){

        //em.getTransaction().begin();
        Cours cours= em.find(Cours.class,id);
        return  cours;

    }

}
