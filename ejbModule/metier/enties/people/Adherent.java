package metier.enties.people;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import metier.enties.Emprunt;

/**
 * Entity implementation class for Entity: Adherent
 *
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Adherent implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String Nom;
	private String Prenom;
	private String Adresse;
	private String Email;
	private int Telephone;
	private int Nb_Emprunt_en_cours=0;
	private boolean Blacklisted=false;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_compte")
	private Compte compte;
	
	@OneToMany(mappedBy="adherent",
			cascade=CascadeType.ALL,
			orphanRemoval=true)
	private List<Emprunt> emprunts;
	
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

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getTelephone() {
		return Telephone;
	}

	public void setTelephone(int telephone) {
		Telephone = telephone;
	}

	public int getNb_Emprunt_en_cours() {
		return Nb_Emprunt_en_cours;
	}

	public void setNb_Emprunt_en_cours(int nb_Emprunt_en_cours) {
		Nb_Emprunt_en_cours = nb_Emprunt_en_cours;
	}
	
	private static final long serialVersionUID = 1L;

	public Adherent() {
		super();
	}

	public boolean isBlacklisted() {
		return Blacklisted;
	}

	public void setBlacklisted(boolean blacklisted) {
		Blacklisted = blacklisted;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public List<Emprunt> getEmprunts() {
		return emprunts;
	}

	public void setEmprunts(List<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}
   
}
