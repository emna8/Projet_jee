package metier.enties.people;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Etudiant
 *
 */
@Entity
public class Etudiant extends Adherent implements Serializable {

	private String Fliere;
	@Temporal(TemporalType.DATE)
	private Date Date_Inscription;
	
	@Transient
	private static final int MAX=3;
	
	//Getter and Setter
	public Date getDate_Inscription() {
		return Date_Inscription;
	}

	public void setDate_Inscription(Date date_Inscription) {
		Date_Inscription = date_Inscription;
	}

	public static int getMax() {
		return MAX;
	}

	public String getFliere() {
		return Fliere;
	}

	public void setFliere(String fliere) {
		Fliere = fliere;
	}

	private static final long serialVersionUID = 1L;

	public Etudiant() {
		super();
	}
   
}
