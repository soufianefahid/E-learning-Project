package ma.ensa.Model.Entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

/**
 * Created by Azedine on 25/04/2016.
 */


@Entity
public class Formateur extends  Personne {
    @Id
    private long ForID;

    @Embedded
    private  Personne Formateur;

    @OneToMany
    List<Cours> courses;


    public Formateur(String nom, String prenom, String email, String pass,
                     String login, Date date_signUp, String image, Personne formateur) {

        super(nom, prenom, email, pass, login, date_signUp, image);
        Formateur = formateur;
    }


    public Formateur() {
    }


}
