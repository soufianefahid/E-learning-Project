package ma.ensa.Model.DaoImpl;


//import ma.ensa.Model.Category;

import ma.ensa.Model.Dao.AdminDao;
import ma.ensa.Model.Entity.Admin;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;

public class AdminDaoImpl  implements AdminDao {


    private EntityManager em=Manager.getInstance();


    public int  AddAdmin(Admin admin){

        try {
            em.getTransaction().begin();
            em.persist(admin);
            em.getTransaction().commit();

            return 1;

        }catch (Exception e){

            return 0;
        }

    }

    public int UpdateAdmin(Admin admin){

        try {


            em.getTransaction().begin();
            em.merge(admin);
            em.getTransaction().commit();
            em.close();

            return   1;

        }catch (Exception e){
            return   0;
        }


    }



    public int DeleteAdminr(long Id){

        try{

            em.getTransaction().begin();
            em.remove(findAdmin(Id));
            em.getTransaction().commit();

            return 1;

        }catch (Exception e) {

            return 0;

        }
    }


    public List<Admin> findAllAdmin(){

        return em.createQuery("select t from Admin t ").getResultList();
    }


    public  Admin findAdmin(long id){

        //em.getTransaction().begin();
        Admin admin= em.find(Admin.class,id);
        return  admin;

    }


}
