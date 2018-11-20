package metier.enties.people;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import metier.enties.Oeuvre;
import metier.enties.SupportPapier;

@Entity
public class Auteur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String Nom;
	private String Prenom;
	
	@OneToMany(mappedBy="auteur")
	private List<Oeuvre> liste_oeuvres;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	
}
