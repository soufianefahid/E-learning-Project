package ma.ensa.Model.Dao;

import ma.ensa.Model.Entity.Chapitre;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Azedine on 25/04/2016.
 */
public class ChapitreDao {



    private EntityManager em=Manager.getInstance();


    public int  AddChapitre(Chapitre chapitre){

        try {
            em.getTransaction().begin();
            em.persist(chapitre);
            em.getTransaction().commit();

            return 1;

        }catch (Exception e){

            return 0;
        }

    }

    public int UpdateCoursr(Chapitre chapitre){

        try {


            em.getTransaction().begin();
            em.merge(chapitre);
            em.getTransaction().commit();
            em.close();

            return   1;

        }catch (Exception e){
            return   0;
        }


    }



    public int DeleteChapitre(long Id){

        try{

            em.getTransaction().begin();
            em.remove(findChapitre(Id));
            em.getTransaction().commit();

            return 1;

        }catch (Exception e) {

            return 0;

        }
    }


    public List<Chapitre> findAllChapitre(){

        return em.createQuery("select t from Chapitre t ").getResultList();
    }


    public  Chapitre findChapitre(long id){

        //em.getTransaction().begin();
        Chapitre chapitre= em.find(Chapitre.class,id);
        return  chapitre;

    }



}
