package services;

import java.util.List;

import javax.ejb.Remote;

import metier.enties.people.Compte;
import metier.enties.people.Etudiant;
import metier.enties.people.JUST;

@Remote
public interface EtudiantServicesRemote {
	//CRUD
	void addEtudiant(Etudiant etudiant);
	void addJust(JUST j);
    Etudiant findEtudiantById(int id);
	void deleteEtudiantById(int id);
	List<Etudiant> listeEtudiant();
	void deleteAllEtudiant();
	void updateEtudiant(Etudiant etudiant);
	Etudiant login(Compte compte);
	}
