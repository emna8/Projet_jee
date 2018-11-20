package metier.enties;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Livre
 *
 */
@Entity

public class Livre implements Serializable {

	enum Etats {
		   Disponible, Emprunte
		}
	@Id
	private int Id;
	@Temporal(TemporalType.DATE)
	private Date Edition ;
	@Enumerated(EnumType.STRING)
	private Etats Etat;
	private float Prix;
	@Column(name="Quantie")
	private int Quantite_en_stock;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_oeuvre")
	private Oeuvre oeuvre;

	@OneToMany(mappedBy="livre",
			cascade=CascadeType.ALL,
			orphanRemoval=true)
	private List<Emprunt> emprunts;
	//Getter and Setter
	public int getQuantite_en_stock() {
		return Quantite_en_stock;
	}

	public void setQuantite_en_stock(int quantite_en_stock) {
		Quantite_en_stock = quantite_en_stock;
	}

	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Date getEdition() {
		return Edition;
	}

	public void setEdition(Date edition) {
		Edition = edition;
	}

	public Etats getEtat() {
		return Etat;
	}

	public void setEtat(Etats etat) {
		Etat = etat;
	}

	private static final long serialVersionUID = 1L;

	public Livre() {
		super();
	}

	public float getPrix() {
		return Prix;
	}

	public void setPrix(float prix) {
		Prix = prix;
	}
   
}
