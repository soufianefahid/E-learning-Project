package ma.ensa.Model.Entity;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Embeddable
public class Personne {


    private String nom;
    private String prenom;
    private String Email;
    private  String pass;
    private String Login;

    @Temporal(TemporalType.DATE)
    private Date date_signUp;

    private String image ;


    public Personne(String nom, String prenom, String email, String pass, String login, Date date_signUp, String image) {
        this.nom = nom;
        this.prenom = prenom;
        Email = email;
        this.pass = pass;
        Login = login;
        this.date_signUp = date_signUp;
        this.image = image;
    }

    public Personne() {
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public Date getDate_signUp() {
        return date_signUp;
    }

    public void setDate_signUp(Date date_signUp) {
        this.date_signUp = date_signUp;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}





