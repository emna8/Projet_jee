package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.enties.people.Compte;
import metier.enties.people.Enseignant;

@Stateless
public class EnseignantServices implements EnseigantServicesLocal ,EseignantServicesRemote {
	
	@PersistenceContext
	EntityManager em;
	@Override
	public void addEnseignat(Enseignant enseignant) {
		em.persist(enseignant);
		}

	@Override
	public Enseignant findEnseignantById(int id) {
		return em.find(Enseignant.class, id);
	}

	@Override
	public void deleteEnseignantById(int id) {
		em.remove(this.findEnseignantById(id));		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Enseignant> listeEnseignant() {
		Query query=em.createQuery("select e from enseingant e",Enseignant.class);
		return query.getResultList();
	}

	@Override
	public void deleteAllEnseignant() {
		for(Enseignant e: this.listeEnseignant()){
			this.deleteEnseignantById(e.getId());
		}
	}

	@Override
	public void updateEnseignant(Enseignant enseignant) {
		em.merge(enseignant);
			
	}

	@Override
	public Enseignant login(Compte compte) {
		Enseignant enseignant = null;
		Query query = em.createQuery("SELECT e FROM enseignant e WHERE  e.compte=:compte");
		query.setParameter("compte", compte);
		try {
			enseignant = (Enseignant) query.getSingleResult();
		} catch (Exception e) {

		}
		return enseignant;
	}

}
