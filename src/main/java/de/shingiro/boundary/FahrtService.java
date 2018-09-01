/**
 * 
 */
package de.shingiro.boundary;

import java.util.List;

import javax.validation.constraints.NotNull;

import de.shingiro.entity.Fahrt;

/**
 *  Interface for Fahrt bean
 * 
 * @author angedesires
 *
 */
public interface FahrtService {
	
public List<Fahrt> findFahrten();
	
	public Fahrt findFahrt(Long fahrtId);
	
	public @NotNull Fahrt createFahrt(@NotNull Fahrt fahrt);
	
	public void deleteFahrt(@NotNull Fahrt fahrt);

}
