/**
 * 
 */
package de.shingiro.boundary;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import de.shingiro.entity.Fahrer;

/**
 *  Interface for Fahrer bean
 * 
 * @author a.shingiro
 *
 */
public interface FahrerService {
	
	public List<Fahrer> findFahrer();
	
	public Fahrer findFahrer(Long fahrerId);
	
	public @NotNull Fahrer createFahrer(@NotNull Fahrer fahrer);
	
	public List<Fahrer> getFahrerByParams(@NotNull String abfahrtsort, 
			@NotNull String ankunftsort, @NotNull Date abfahrtszeit);
	
	public void deleteFahrer(@NotNull Fahrer fahrerId);

}
