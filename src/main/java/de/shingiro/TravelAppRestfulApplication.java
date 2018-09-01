/**
 * 
 */
package de.shingiro;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import de.shingiro.boundary.FahrerResource;
import de.shingiro.boundary.FahrtResource;

/**
 * @author a.shingiro
 *
 */
@ApplicationPath("resources")
public class TravelAppRestfulApplication extends Application {
	
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		
		//register CORS filter
		classes.add(TravelAppRestCorsFilter.class);
		
		// register Fahrer resource
		classes.add(FahrerResource.class);
		
		// register Fahrt resource
		classes.add(FahrtResource.class);
		
		return classes;
	}

}
