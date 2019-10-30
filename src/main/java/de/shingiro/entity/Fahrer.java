/**
 * 
 */
package de.shingiro.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Persistence class for driver object
 * 
 * @author a.shingiro
 *
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@NamedQueries({@NamedQuery(name = "Fahrer.findAll", query = "SELECT f FROM Fahrer f"),
		@NamedQuery(name = "Fahrer.findById", query = "SELECT f FROM Fahrer f WHERE f.fahrerId = :fahrerId"),
		@NamedQuery(name = "Fahrer.findByReqParams", query = "SELECT f FROM Fahrer f WHERE f.abfahrtsort = :abfahrtsort "
				+ "AND f.ankunftsort = :ankunftsort") })
public class Fahrer implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "Fahrer.findAll";

	public static final String FIND_BY_ID = "Fahrer.findById";
	
	public static final String FIND_BY_REQ_PARAMS = "Fahrer.findByReqParams";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fahrerSeq")
	@SequenceGenerator(name = "fahrerSeq", sequenceName = "fahrerSeq", initialValue = 1, allocationSize = 100)
	private Long fahrerId;

	@NotNull
	private String vorname;

	@NotNull
	private String nachname;

	@NotNull
	private String telefonnummer;

	@Size(min = 0, max = 240)
	private String nachricht;

	@NotNull
	private String abfahrtsort;

	@NotNull
	private String ankunftsort;

	@NotNull
	private Date abfahrtszeit;

}
