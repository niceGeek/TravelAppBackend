/**
 * 
 */
package de.shingiro.boundary;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import de.shingiro.entity.Fahrer;

/**
 *  Bean class for Fahrer entity
 * 
 * @author a.shingiro
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class FahrerBean implements FahrerService {
	
	@PersistenceContext(unitName = "travelAppDB")
	private EntityManager entityManager;
	
	
	public FahrerBean() {
		// TODO Auto-generated constructor stub
	}
	/**
	 *  Find all drivers in the database
	 * @return List of all drivers in the database
	 */
	public List<Fahrer> findFahrer() {
		TypedQuery<Fahrer> query = entityManager.createNamedQuery(Fahrer.FIND_ALL, Fahrer.class);
		return query.getResultList();
	}
	
	/**
	 *  Find a specific driver through its ID
	 * @param fahrerId
	 * @return fahrer a specific driver
	 */
	public Fahrer findFahrer(Long fahrerId) {
		return entityManager.find(Fahrer.class, fahrerId);
	}
	
	/**
	 * Create a driver instance in the database
	 * 
	 * @param fahrer
	 * @return driver the created driver instance
	 */
	public Fahrer createFahrer(Fahrer fahrer) {
		entityManager.persist(fahrer);
		return fahrer; 
	}
	
	/** 
	 * Remove a driver permanently from the database
	 * Only admin is allowed to perform this operation
	 * 
	 * @param fahrer 
	 */
	@RolesAllowed("admin")
	public void deleteFahrer(Fahrer fahrer) {
		entityManager.remove(entityManager.merge(fahrer));
	}
}
