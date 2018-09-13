package de.shingiro.entity;

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
@NamedQueries({ 
	@NamedQuery(name = "Fahrt.findAll", query = "SELECT f FROM Fahrt f"),
	@NamedQuery(name = "Fahrt.findById", query = "SELECT f FROM Fahrt f WHERE f.fahrtId = :fahrtId") })
public class Fahrt implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "Fahrt.findAll";

	public static final String FIND_BY_ID = "Fahrt.findById";

	public Fahrt() {

	}

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

	public Long getFahrtId() {
		return fahrtId;
	}

	public void setFahrtId(Long fahrtId) {
		this.fahrtId = fahrtId;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departure == null) ? 0 : departure.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((fahrtId == null) ? 0 : fahrtId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fahrt other = (Fahrt) obj;
		if (departure == null) {
			if (other.departure != null)
				return false;
		} else if (!departure.equals(other.departure))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (fahrtId == null) {
			if (other.fahrtId != null)
				return false;
		} else if (!fahrtId.equals(other.fahrtId))
			return false;
		return true;
	}

}
