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
}

}