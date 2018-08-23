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
@Path("/kinder")
@Transactional
public class KindResource {
	
	@Context
	private UriInfo uriInfo;
	
	@PersistenceContext(unitName = "KIWIDB")
	private EntityManager entityManager;
	
	@Inject
	private KindService kindService;
	
	
	public KindResource() {
		// TODO Auto-generated constructor stub
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Transactional(Transactional.TxType.SUPPORTS)
	public List<Fahrer> findeAlleKinder() {
		return kindService.findKinder();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/kind/{kindId}")
	public Fahrer findeKind(@PathParam("kindId") Long kindId) {
		return kindService.findKind(kindId);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/neuesKind")
	public Response legeKindAn( Fahrer kind) {
		entityManager.persist(kind);
		URI kindURI = uriInfo.getAbsolutePathBuilder().path(kind.getKindId().toString()).build();
		return Response.created(kindURI).build();
	}
}
