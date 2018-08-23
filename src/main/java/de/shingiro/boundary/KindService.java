/**
 * 
 */
package de.shingiro.boundary;

import java.util.List;

import javax.validation.constraints.NotNull;

import de.shingiro.entity.Fahrer;

/**
 *  Interface for Kind bean
 * 
 * @author a.shingiro
 *
 */
public interface KindService {
	
	public List<Fahrer> findKinder();
	
	public Fahrer findKind(Long kindId);
	
	public @NotNull Fahrer createKind(@NotNull Fahrer kind);
	
	public void deleteKind(@NotNull Fahrer kind);

}
