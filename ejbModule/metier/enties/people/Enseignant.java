package metier.enties.people;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Enseignant
 *
 */
@Entity
public class Enseignant extends Adherent implements Serializable{

	private String Grade;
	private String Departement;
	
	@Transient
	private static final int MAX=5;
	
	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public String getDepartement() {
		return Departement;
	}

	public void setDepartement(String departement) {
		Departement = departement;
	}

	private static final long serialVersionUID = 1L;

	public Enseignant() {
		super();
	}

	public static int getMax() {
		return MAX;
	}
   
}
