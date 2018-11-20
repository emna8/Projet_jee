package metier.enties;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import metier.enties.people.Auteur;

@Entity
//TABLE_PER_CLASS
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Oeuvre implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String Titre;
	private int Nb_DVD;
	private int Nb_Papier;
	@ManyToOne
	@JoinColumn(name="id_auteur")
	private Auteur auteur;
	
	@ManyToOne
	@JoinColumn(name="id_categorie")
	private Categorie categorie;
	
	@OneToMany(mappedBy="oeuvre")
	private List<Livre> liste_livre;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitre() {
		return Titre;
	}

	public void setTitre(String titre) {
		Titre = titre;
	}

	public int getNb_DVD() {
		return Nb_DVD;
	}

	public void setNb_DVD(int nb_DVD) {
		Nb_DVD = nb_DVD;
	}


	public int getNb_Papier() {
		return Nb_Papier;
	}

	public void setNb_Papier(int nb_Papier) {
		Nb_Papier = nb_Papier;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}


	private static final long serialVersionUID = 8574332493340597776L;
	
	
	
}
