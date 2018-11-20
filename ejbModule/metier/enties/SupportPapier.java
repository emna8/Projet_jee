package metier.enties;

import javax.persistence.Entity;

@Entity
public class SupportPapier extends Oeuvre {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8400870440642084484L;
	
	private int CopieDispo;

	public int getCopieDispo() {
		return CopieDispo;
	}

	public void setCopieDispo(int copieDispo) {
		CopieDispo = copieDispo;
	}
	

}
