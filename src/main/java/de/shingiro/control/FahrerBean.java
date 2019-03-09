package de.shingiro.control;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import de.shingiro.boundary.FahrerService;
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
	 * @return {@link List<Fahrer>} a list of all drivers in the database
	 */
	public List<Fahrer> findFahrer() {
		TypedQuery<Fahrer> query = entityManager.createNamedQuery(Fahrer.FIND_ALL, Fahrer.class);
		return query.getResultList();
	}
	
	/**
	 *  Find a specific driver through its ID
	 * @param fahrerId
	 * @return {@link Fahrer} a specific driver
	 */
	public Fahrer findFahrer(Long fahrerId) {
		return entityManager.find(Fahrer.class, fahrerId);
	}
	
	/**
	 * Create a driver instance in the database
	 * 
	 * @param fahrer
	 * @return {@link Fahrer} the created driver instance
	 */
	public Fahrer createFahrer(Fahrer fahrer) {
		entityManager.persist(fahrer);
		return fahrer; 
	}
	
	/**
	 * Fetch data sets from DB using many request parameters
	 * @param abfahrtsort departure
	 * @param ankunftsort destination
	 * @return Fahrer the corresponding driver
	 * TODO: add time attribute
	 */
	public List<Fahrer> getFahrerByParams(String abfahrtsort, String ankunftsort) {
		TypedQuery<Fahrer> query = entityManager.createNamedQuery(Fahrer.FIND_BY_REQ_PARAMS, Fahrer.class)
									 .setParameter("abfahrtsort", abfahrtsort)
									 .setParameter("ankunftsort", ankunftsort);
		return query.getResultList();				
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
