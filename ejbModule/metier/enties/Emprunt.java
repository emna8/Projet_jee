package metier.enties;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.persistence.GeneratedValue;

import metier.enties.people.Adherent;

@Entity
public class Emprunt implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private EmpruntPK Id;
	private Date Date_emprunt;
	private Date Date_RT;
	private Date Date_REFF;
	private int Nb_avertissment;
	private String Type_support;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Livre livre;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Adherent adherent ;

	public EmpruntPK getId() {
		return Id;
	}
	public void setId(EmpruntPK id) {
		Id = id;
	}
	public Date getDate_emprunt() {
		return Date_emprunt;
	}
	public void setDate_emprunt(Date date_emprunt) {
		Date_emprunt = date_emprunt;
	}
	public Date getDate_RT() {
		return Date_RT;
	}
	public void setDate_RT(Date date_RT) {
		Date_RT = date_RT;
	}
	public Date getDate_REFF() {
		return Date_REFF;
	}
	public void setDate_REFF(Date date_REFF) {
		Date_REFF = date_REFF;
	}
	public int getNb_avertissment() {
		return Nb_avertissment;
	}
	public void setNb_avertissment(int nb_avertissment) {
		Nb_avertissment = nb_avertissment;
	}
	public String getType_support() {
		return Type_support;
	}
	public void setType_support(String type_support) {
		Type_support = type_support;
	}
	
	
	
	
	
}
