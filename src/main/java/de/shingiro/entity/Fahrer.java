/**
 * 
 */
package de.shingiro.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
@NamedQueries({ 
	@NamedQuery(name = "Fahrer.findAll", query = "SELECT f FROM Fahrer f"),
	@NamedQuery(name = "Fahrer.findById", query = "SELECT f FROM Fahrer f WHERE f.fahrerId = :fahrerId") })
public class Fahrer implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "Fahrer.findAll";

	public static final String FIND_BY_ID = "Fahrer.findById";

	public Fahrer() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fahrerSeq")
	@SequenceGenerator(name="fahrerSeq", sequenceName = "fahrerSeq", initialValue = 1, allocationSize = 100)
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
	private String abfahrtzeit;

	@ManyToOne
	private Fahrt fahrt;

	public Long getFahrerId() {
		return fahrerId;
	}

	public void setFahrerId(Long fahrerId) {
		this.fahrerId = fahrerId;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	public String getNachricht() {
		return nachricht;
	}

	public void setNachricht(String nachricht) {
		this.nachricht = nachricht;
	}

	public String getAbfahrtzeit() {
		return abfahrtzeit;
	}

	public void setAbfahrtzeit(String abfahrtzeit) {
		this.abfahrtzeit = abfahrtzeit;
	}

	public Fahrt getFahrt() {
		return fahrt;
	}

	public void setFahrt(Fahrt fahrt) {
		this.fahrt = fahrt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abfahrtzeit == null) ? 0 : abfahrtzeit.hashCode());
		result = prime * result + ((fahrerId == null) ? 0 : fahrerId.hashCode());
		result = prime * result + ((fahrt == null) ? 0 : fahrt.hashCode());
		result = prime * result + ((nachname == null) ? 0 : nachname.hashCode());
		result = prime * result + ((nachricht == null) ? 0 : nachricht.hashCode());
		result = prime * result + ((telefonnummer == null) ? 0 : telefonnummer.hashCode());
		result = prime * result + ((vorname == null) ? 0 : vorname.hashCode());
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
		Fahrer other = (Fahrer) obj;
		if (abfahrtzeit == null) {
			if (other.abfahrtzeit != null)
				return false;
		} else if (!abfahrtzeit.equals(other.abfahrtzeit))
			return false;
		if (fahrerId == null) {
			if (other.fahrerId != null)
				return false;
		} else if (!fahrerId.equals(other.fahrerId))
			return false;
		if (fahrt == null) {
			if (other.fahrt != null)
				return false;
		} else if (!fahrt.equals(other.fahrt))
			return false;
		if (nachname == null) {
			if (other.nachname != null)
				return false;
		} else if (!nachname.equals(other.nachname))
			return false;
		if (nachricht == null) {
			if (other.nachricht != null)
				return false;
		} else if (!nachricht.equals(other.nachricht))
			return false;
		if (telefonnummer == null) {
			if (other.telefonnummer != null)
				return false;
		} else if (!telefonnummer.equals(other.telefonnummer))
			return false;
		if (vorname == null) {
			if (other.vorname != null)
				return false;
		} else if (!vorname.equals(other.vorname))
			return false;
		return true;
	}

}
