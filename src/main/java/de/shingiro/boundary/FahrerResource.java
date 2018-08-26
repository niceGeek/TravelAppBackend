/**
 * 
 */
package de.shingiro.boundary;

import java.net.URI;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import de.shingiro.entity.Fahrer;

/**
 *  REST API for KindBean
 * 
 * @author a.shingiro
 *
 */
@Path("/fahrer")
@Transactional
public class FahrerResource {
	
	@Context
	private UriInfo uriInfo;
	
	@PersistenceContext(unitName = "traveAppDB")
	private EntityManager entityManager;
	
	@Inject
	private FahrerService fahrerService;
	
	
	public FahrerResource() {
		// TODO Auto-generated constructor stub
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Transactional(Transactional.TxType.SUPPORTS)
	public List<Fahrer> findeAlleKinder() {
		return fahrerService.findFahrer();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/fahrer/{fahrerId}")
	public Fahrer findeKind(@PathParam("fahrerId") Long fahrerId) {
		return fahrerService.findFahrer(fahrerId);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/neuerFahrer")
	public Response legeFahrerAn( Fahrer fahrer) {
		entityManager.persist(fahrer);
		URI kindURI = uriInfo.getAbsolutePathBuilder().path(fahrer.getFahrerId().toString()).build();
		return Response.created(kindURI).build();
	}
}
