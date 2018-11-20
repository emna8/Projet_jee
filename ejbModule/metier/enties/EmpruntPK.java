package metier.enties;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: EmpruntPK
 *
 */
@Embeddable
public class EmpruntPK implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name="livre_id")
	private int livre_id;
	@Column(name="adherent_id")
	private int adherent_id;
	
	public int getLivre_id() {
		return livre_id;
	}
	public void setLivre_id(int livre_id) {
		this.livre_id = livre_id;
	}
	public int getAdherent_id() {
		return adherent_id;
	}
	public void setAdherent_id(int adherent_id) {
		this.adherent_id = adherent_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + adherent_id;
		result = prime * result + livre_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpruntPK other = (EmpruntPK) obj;
		if (adherent_id != other.adherent_id)
			return false;
		if (livre_id != other.livre_id)
			return false;
		return true;
	}
	public EmpruntPK(int livre_id, int adherent_id) {
		super();
		this.livre_id = livre_id;
		this.adherent_id = adherent_id;
	}
	public EmpruntPK() {
		super();
	}
	

}