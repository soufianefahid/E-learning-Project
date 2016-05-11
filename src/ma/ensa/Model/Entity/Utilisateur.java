package ma.ensa.Model.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Azedine on 25/04/2016.
 */

@Entity
public class Utilisateur extends Personne  {


    @Id
    @GeneratedValue
    private  long UserId;

    @Embedded
    private Personne User;

    @OneToMany
    List<Cours> coursesInsc;


    public Utilisateur(String nom, String prenom, String email, String pass, String login,
                       Date date_signUp, String image, Personne user) {
        super(nom, prenom, email, pass, login, date_signUp, image);
        User = user;
    }

    public Utilisateur() {
    }

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public Personne getUser() {
        return User;
    }

    public void setUser(Personne user) {
        User = user;
    }
}
