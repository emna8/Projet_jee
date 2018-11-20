package services;

import java.util.List;

import javax.ejb.Local;

import metier.enties.people.Compte;
import metier.enties.people.Enseignant;
import metier.enties.people.Etudiant;


@Local
public interface EnseigantServicesLocal {
	//CRUD
	void addEnseignat(Enseignant enseignant);
	Enseignant findEnseignantById(int id);
	void deleteEnseignantById(int id);
	List<Enseignant> listeEnseignant();
	void deleteAllEnseignant();
	void updateEnseignant(Enseignant enseignant);
	Enseignant login(Compte compte);

}
