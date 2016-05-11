package ma.ensa.Model.Dao;

import ma.ensa.Model.DaoImpl.Manager;
import ma.ensa.Model.Entity.Formateur;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Azedine on 25/04/2016.
 */

public class FormateurDaoImpl {


    private EntityManager em= Manager.getInstance();


    public int  AddFormateur(Formateur formateur){

        try {
            em.getTransaction().begin();
            em.persist(formateur);
            em.getTransaction().commit();

            return 1;

        }catch (Exception e){

            return 0;
        }

    }

    public int UpdateFormateur(Formateur formateur){

        try {


            em.getTransaction().begin();
            em.merge(formateur);
            em.getTransaction().commit();
            em.close();

            return   1;

        }catch (Exception e){
            return   0;
        }


    }



    public int DeleteFormateur(long Id){

        try{

            em.getTransaction().begin();
            em.remove(findFormateur(Id));
            em.getTransaction().commit();

            return 1;

        }catch (Exception e) {

            return 0;

        }
    }


    public List<Formateur> findAllFormateur(){

        return em.createQuery("select t from Formateur t ").getResultList();
    }


    public  Formateur findFormateur(long id){

        //em.getTransaction().begin();
        Formateur formateur= em.find(Formateur.class,id);
        return  formateur;

    }


}




