package metier.enties;

import javax.persistence.Entity;

@Entity
public class SupportPdf  extends Oeuvre
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5124140491596871324L;
	private int CopieDispo;
	public int getCopieDispo() {
		return CopieDispo;
	}
	public void setCopieDispo(int copieDispo) {
		CopieDispo = copieDispo;
	}

}
