package metier.enties.people;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: JUST
 *
 */
@Entity

public class JUST implements Serializable {

	@Id
	@GeneratedValue
	private int id;
	
	private String nom;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	private static final long serialVersionUID = 1L;

	public JUST() {
		super();
	}
   
}
