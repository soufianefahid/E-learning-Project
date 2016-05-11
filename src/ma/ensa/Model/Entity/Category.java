
package ma.ensa.Model.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private long id;

    private String titre;
    private String description;
    private String image;

    @Temporal(TemporalType.DATE)
    private Date cdate;


    @OneToMany
    private List<Category> parentCats;

    @OneToMany
    private List<Cours> courses;


    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public List<Cours> getCourses() {
        return courses;
    }

    public void setCourses(List<Cours> courses) {
        this.courses = courses;
    }




    public Category() {
    }

    
    //Getters Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return titre;
    }

    public void setNom(String nom) {
        this.titre = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }



    public List<Category> getParentCats() {
        return parentCats;
    }

    public void setParentCats(List<Category> parentCats) {
        this.parentCats = parentCats;
    }


    public Category(String titre, String description, String image, Date cdate) {
        this.titre = titre;
        this.description = description;
        this.image = image;
        this.cdate = cdate;
    }

    public Category(String titre, String description, String image, Date cdate, List<Category> parentCats, List<Cours> courses) {
        this.titre = titre;
        this.description = description;
        this.image = image;
        this.cdate = cdate;
        this.parentCats = parentCats;
        this.courses = courses;
    }


}
