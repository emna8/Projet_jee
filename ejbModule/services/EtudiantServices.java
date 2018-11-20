package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.enties.people.Compte;
import metier.enties.people.Etudiant;
import metier.enties.people.JUST;


@Stateless
public class EtudiantServices implements EtudiantServicesRemote,EtudiantServiceLocal{

	@PersistenceContext
	EntityManager em;
	@Override
	public void addEtudiant(Etudiant etudiant) {
	     em.persist(etudiant);
		System.out.print("houniiiiiiiiiiiiiiiiiiiii");
	}

	@Override
	public Etudiant findEtudiantById(int id) {
		Etudiant e=em.find(Etudiant.class, id);
		return e;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Etudiant> listeEtudiant() {
		Query query=em.createQuery("select e from etudiant e",Etudiant.class);
		return query.getResultList();
	}
	
	@Override
	public void deleteEtudiantById(int id) {
		em.remove(this.findEtudiantById(id));		
	}

	@Override
	public void deleteAllEtudiant() {
		List<Etudiant> liste_to_delete=this.listeEtudiant();
		for(Etudiant e :liste_to_delete){
			this.deleteEtudiantById(e.getId());
		}
	}

	@Override
	public void updateEtudiant(Etudiant etudiant) {
		em.merge(etudiant);		
	}

	@Override
	public Etudiant login(Compte compte) {
		Etudiant etudiant = null;
		Query query = em.createQuery("SELECT e FROM etudiant e WHERE  e.compte=:compte");
		query.setParameter("compte", compte);
		try {
			etudiant = (Etudiant) query.getSingleResult();
		} catch (Exception e) {

		}
		return etudiant;
	}

	@Override
	public void addJust(JUST j) {
		em.persist(j);
	}


}
