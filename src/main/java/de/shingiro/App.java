package de.shingiro;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.shingiro.entity.Fahrer;


/**
 * Hello world!
 *
 */
public class App 
{

	public static void main( String[] args ) {
    	
		
    	//EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("KIWIDB");
    	//EntityManager em = emFactory.createEntityManager();
    	/*
    	// Populate the database
    	Kind femaleKind = new Kind();
    	femaleKind.setKindId(305L);
		femaleKind.setSteuerId(30294787560L);
		femaleKind.setFamilienname("Rogers");
		femaleKind.setExFamilienname("Rogers");
		femaleKind.setVorname("Leslie");
		femaleKind.setGeburtsdatum("25.10.2010");
		femaleKind.setGeschlecht("weiblich");
		femaleKind.setStaatsangehoerigkeit("Englisch");
		
		Kind maleKind = new Kind();
		maleKind.setKindId(405L);
		maleKind.setSteuerId(40293898660L);
		maleKind.setFamilienname("Hartmann");
		maleKind.setExFamilienname("Hartmann");
		maleKind.setVorname("Dennis");
		maleKind.setGeburtsdatum("13.09.2004");
		maleKind.setGeschlecht("männlich");
		maleKind.setStaatsangehoerigkeit("Deutsch");
		
		em.getTransaction().begin();
		em.persist(femaleKind);
		em.persist(maleKind);
    	
		em.getTransaction().commit();
    	
		System.out.println("Successfully saved into DB");
    	*/
	
    	// DB fetch
    	/*
    	List<Kind> kinder = em.createNamedQuery("Kind.FIND_ALL", Kind.class).getResultList();
    	kinder.stream().forEach(entity -> System.out.println("Familienname: " + entity.getFamilienname()));
    	*/
		
//		@Inject
//		private FahrerBean bean;
		
//		@Inject
//		private DatenZugriffsManager datenZugriffsManager;
	//	
		/**
		 * @param args
		 */
			
			/*
			// Creates an instance of driver
			Fahrer fahrer = new Fahrer();
			fahrer.setId(150L);
			fahrer.setVorname("Jamie");
			fahrer.setNachname("Oliver");
			fahrer.setTelefonnummer("-156-123456");
			fahrer.setNachricht("You changed me baby!");
			fahrer.setAbfahrtzeit("15:20:00");
			
			// Creates an instance of the client
			Fahrgast fahrgast = new Fahrgast();
			fahrgast.setId(600L);
			fahrgast.setVorname("Robert");
			fahrgast.setNachname("Killian");
			fahrgast.setTelefonnummer("+127-98678");
			fahrgast.setNachricht("I am looking for a ride");
			fahrgast.setAbfahrtzeit("15:45:00");
			*/

			// Obtains an entity manager and a transaction
			// EntityManagerFactory emf = Persistence.createEntityManagerFactory("travelappdb");
			// EntityManager em = emf.createEntityManager();

			// Persists the driver to the database
			// EntityTransaction tx = em.getTransaction();
			// tx.begin();
			// em.persist(fahrer);
			// em.persist(fahrgast);
			// Response response = Response.ok().entity(Entity.entity(Fahrer.class, "application/json")).build();
			// System.out.println("Here you are: " + response);
			// Fahrer driver = em.find(Fahrer.class, 135L);
			// System.out.println("CHECK: " + driver.getVorname() + " " + driver.getNachname());
			
			// Creates JSON object out of response
			/*
			Response response = Response.ok().build();
			System.out.println("ENTITY: " + response);
			*/
			// tx.commit();

			// Closes the entity manager and the factory
			// em.close();
			// emf.close();
//			
//			Fahrer driver = new DatenZugriffsManager().findeFahrer(135L);
//			
//			System.out.println("Bitte schoen: " + driver.getVorname() + " " + driver.getNachname());
			
		}
}

