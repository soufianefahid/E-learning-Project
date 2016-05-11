package ma.ensa.Model.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * Created by Azedine on 25/04/2016.
 */


@Entity
public class Cours {

    @Id @GeneratedValue
    private  long CourseID;

    private  String titreCours;
    private  String CoursDescr;
    private  int duree;
    private  float prix;
    private  int Niveau ;
    private  String langue;
    private  String Image;

    @Temporal(TemporalType.DATE)
    private Date Creationdate;


    @OneToOne
    private Formateur formateur ;

    @OneToMany
    List<Chapitre> chapitres ;
    @OneToOne
    Category category;




}
