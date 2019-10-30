package de.shingiro.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

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
 * Entity class for ride object
 * 
 * @author angedesires
 *
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@NamedQueries({ 
	@NamedQuery(name = "Fahrt.findAll", query = "SELECT f FROM Fahrt f"),
	@NamedQuery(name = "Fahrt.findById", query = "SELECT f FROM Fahrt f WHERE f.fahrtId = :fahrtId") })
public class Fahrt implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "Fahrt.findAll";

	public static final String FIND_BY_ID = "Fahrt.findById";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fahrtSeq")
	@SequenceGenerator(name="fahrtSeq", sequenceName = "fahrtSeq", initialValue = 1, allocationSize = 100)
	public Long fahrtId;

	@NotNull
	public String departure;

	@NotNull
	public String destination;

	@Size(min = 0, max = 240)
	public String description;

}
