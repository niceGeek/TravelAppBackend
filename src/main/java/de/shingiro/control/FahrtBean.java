/**
 * 
 */
package de.shingiro.control;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.validation.constraints.NotNull;

import de.shingiro.boundary.FahrtService;
import de.shingiro.entity.Fahrt;

/**
 * Bean class for Fahrt entity
 * 
 * @author angedesires
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class FahrtBean implements FahrtService {

	@PersistenceContext(unitName = "travelAppDB")
	private EntityManager entityManager;

	public FahrtBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Fahrt> findFahrten() {
		TypedQuery<Fahrt> alleFahrten = 
				entityManager.createNamedQuery(Fahrt.FIND_ALL, Fahrt.class);
		return alleFahrten.getResultList();
	}

	/**
	 * Find a specific ride through its ID
	 * 
	 * @param fahrtId
	 *            The ID of the ride to find
	 * @return {@link Fahrt} the ride found in the database
	 */
	@Override
	public Fahrt findFahrt(Long fahrtId) {
		return entityManager.find(Fahrt.class, fahrtId);
	}

	/**
	 * 
	 * Add a new ride to the database
	 * 
	 * @param fahrt
	 *            the ride object to create
	 * @return {@link Fahrt} the newly created ride
	 */
	@Override
	public @NotNull Fahrt createFahrt(@NotNull Fahrt fahrt) {
		entityManager.persist(fahrt);
		return fahrt;
	}

	/**
	 * Delete a ride from the database
	 * @param fahrt the ride to removed from the database
	 * 
	 */
	@Override
	public void deleteFahrt(@NotNull Fahrt fahrt) {
		entityManager.remove(entityManager.merge(fahrt));
	}

}
