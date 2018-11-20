package services;

import java.util.List;

import javax.ejb.Remote;

import metier.enties.people.Compte;
import metier.enties.people.Enseignant;

@Remote
public interface EseignantServicesRemote {
	void addEnseignat(Enseignant enseignant);
	Enseignant findEnseignantById(int id);
	void deleteEnseignantById(int id);
	List<Enseignant> listeEnseignant();
	void deleteAllEnseignant();
	void updateEnseignant(Enseignant enseignant);
	Enseignant login(Compte compte);

}
