/**
 * 
 */
package de.shingiro.boundary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

import javax.persistence.Query;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import de.shingiro.entity.Fahrer;

/**
 *  Unit test class for KindBean
 * 
 * @author a.shingiro
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class KindBeanTest {
	
	@Mock
	private EntityManager entityManager;
	
	@Mock
	private TypedQuery<Fahrer> query;
	
	@InjectMocks
	private FahrerBean kindBean;
	
	@Test
	public void testFindAll() {
		
		List<Fahrer> mockKinder = new ArrayList<>();
		
		//when(entityManager.createNamedQuery("Kind.FIND_ALL", Kind.class).getResultList()).thenReturn(mockKinder);
	}
	
	
	/*
	
	@Test
	public void testFindAll() {
		// Stub the entity manager to return a meaningful result when somebody asks
		// for the FIND_ALL named query
		Query query = mock(Query.class);
		when(entityManager.createNamedQuery(Kind.FIND_ALL, Kind.class)).thenReturn((TypedQuery<Kind>) query);
		
		// Stub the query returned above to return a meaningful result when somebody
		// asks for the result list
		List<Kind> dummyKinder = new ArrayList<>();
		when(query.getResultList()).thenReturn(dummyKinder);
		
		// Let's call findAll and see what it does
		List<Kind> alleKinder = bean.findKinder();
		
		// did it request the named query?
		verify(entityManager).createNamedQuery(Kind.FIND_ALL, Kind.class);
		
		// did it ask for the result list of the named query?
		verify(query).getResultList();
		
		// did it return the result list of the named query?
		assertSame(dummyKinder, alleKinder);
	}
	*/
}
