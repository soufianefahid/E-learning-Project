package ma.ensa.Model.DaoImpl;

import ma.ensa.Model.Dao.CategoryDao;
import ma.ensa.Model.Entity.Category;
import ma.ensa.Model.Entity.Cours;

import javax.persistence.EntityManager;
import java.io.File;
import java.util.List;


public class CategoryDaoImpl implements CategoryDao {

    private EntityManager em=Manager.getInstance();



   public int  AddCategory(Category category){

       try {
           em.getTransaction().begin();
           em.persist(category);
           em.getTransaction().commit();
           File file = new File("web/Categories/"+category.getNom());
           file.mkdir();
          // em.close();
           return 1;

       }catch (Exception e){

           return 0;
       }


    }

    public List <Cours> findAllCoursOfCategory(long Id){
        return em.find(Category.class,Id).getCourses();

    }

    public int UpdateCategory(Category cat){

        try {


            em.getTransaction().begin();
            em.merge(cat);
            em.getTransaction().commit();
            em.close();

            return   1;

        }catch (Exception e){
            return   0;
        }


    }



    public int DeleteCategory(long Id){

        try{

            em.getTransaction().begin();
            em.remove(findCategory(Id));
            em.getTransaction().commit();

            return 1;

        }catch (Exception e) {

            return 0;

        }
    }


   public List<Category> findAll(){

       return em.createQuery("select t from Category t ").getResultList();
    }


    public  Category findCategory(long id){
        //em.getTransaction().begin();
       Category cat= em.find(Category.class,id);
        return  cat;
    }




}
