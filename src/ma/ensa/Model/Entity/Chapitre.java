package ma.ensa.Model.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by Azedine on 25/04/2016.
 */

@Entity
public class Chapitre {

    @Id
    private long id_chaptre;

    private String titre_chap;
    private String Chap_Desc;
    private  int Chap_Num;
    private String url ;


    @OneToOne
    private Cours cours;


}
