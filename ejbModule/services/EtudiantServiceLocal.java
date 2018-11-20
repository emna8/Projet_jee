package services;

import java.util.List;

import javax.ejb.Local;

import metier.enties.people.Compte;
import metier.enties.people.Etudiant;


@Local
public interface EtudiantServiceLocal {
	
	//CRUD
	void addEtudiant(Etudiant etudiant);
    Etudiant findEtudiantById(int id);
	void deleteEtudiantById(int id);
	List<Etudiant> listeEtudiant();
	void deleteAllEtudiant();
	void updateEtudiant(Etudiant etudiant);
	Etudiant login(Compte compte);
}
