/**
 * 
 */
package de.shingiro;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import de.shingiro.boundary.FahrerResource;

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
		
		// register Kind resource
		classes.add(FahrerResource.class);
		
		return classes;
	}

}
