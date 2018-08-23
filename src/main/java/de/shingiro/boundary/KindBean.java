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
 *  Bean class for Kind entity
 * 
 * @author a.shingiro
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class KindBean implements KindService {
	
	@PersistenceContext(unitName = "KIWIDB")
	private EntityManager entityManager;
	
	
	public KindBean() {
		// TODO Auto-generated constructor stub
	}
	/**
	 *  Find all kids in the database
	 * @return List of all kids in the database
	 */
	public List<Fahrer> findKinder() {
		TypedQuery<Fahrer> query = entityManager.createNamedQuery(Fahrer.FIND_ALL, Fahrer.class);
		return query.getResultList();
	}
	
	/**
	 *  Find a specific kid through its ID
	 * @param kindId
	 * @return Kind a specific kid
	 */
	public Fahrer findKind(Long kindId) {
		return entityManager.find(Fahrer.class, kindId);
	}
	
	/**
	 * Create a kid instance in the database
	 * 
	 * @param kind
	 * @return Kind the created kid instance
	 */
	public Fahrer createKind(Fahrer kind) {
		entityManager.persist(kind);
		return kind; 
	}
	
	/** 
	 * Remove a kid permanently from the database
	 * Only admin is allowed to perform this operation
	 * 
	 * @param kind 
	 */
	@RolesAllowed("admin")
	public void deleteKind(Fahrer kind) {
		entityManager.remove(entityManager.merge(kind));
	}
}
