/**
 * 
 */
package de.shingiro.boundary;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import de.shingiro.entity.Fahrt;

/**
 *  REST interface for FahrtBean
 * 
 * @author angedesires
 *
 */
@Path("/fahrten")
@Transactional
public class FahrtResource {
	
	@Context
	private UriInfo uriInfo;
	
	@PersistenceContext(name="travelAppDB")
	private EntityManager entityManager;
	
	@Inject
	private FahrtService fahrtService;

	public FahrtResource() {
		//super();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Fahrt> findeAlleFahrten() {
		return fahrtService.findFahrten();
	}
	

}
