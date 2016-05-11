package ma.ensa.Model.Entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Azedine on 25/04/2016.
 */

@Entity
public class Admin extends Personne  {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue
    private long ID;

    @Embedded
    private  Personne admin;


    public Admin(String nom, String prenom, String email, String pass,
                 String login, Date date_signUp, String image, Personne admin) {

        super(nom, prenom, email, pass, login, date_signUp, image);

        this.admin = admin;
    }


    public Admin() {
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Personne getAdmin() {
        return admin;
    }

    public void setAdmin(Personne admin) {
        this.admin = admin;
    }
}
