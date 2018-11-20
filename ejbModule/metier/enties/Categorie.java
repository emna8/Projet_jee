package metier.enties;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class Categorie implements Serializable{
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String Libelle;
	
	
	@OneToMany(mappedBy="categorie")
	private List<Oeuvre> liste_oeuvres;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getLibelle() {
		return Libelle;
	}
	public void setLibelle(String libelle) {
		Libelle = libelle;
	}
	
	

}
