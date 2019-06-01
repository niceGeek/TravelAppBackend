/**
 * 
 */
package de.shingiro.entity;

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
@NamedQueries({@NamedQuery(name = "Fahrer.findAll", query = "SELECT f FROM Fahrer f"),
		@NamedQuery(name = "Fahrer.findById", query = "SELECT f FROM Fahrer f WHERE f.fahrerId = :fahrerId"),
		@NamedQuery(name = "Fahrer.findByReqParams", query = "SELECT f FROM Fahrer f WHERE f.abfahrtsort = :abfahrtsort "
				+ "AND f.ankunftsort = :ankunftsort") })
public class Fahrer implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "Fahrer.findAll";

	public static final String FIND_BY_ID = "Fahrer.findById";
	
	public static final String FIND_BY_REQ_PARAMS = "Fahrer.findByReqParams";

	public Fahrer() {

	}

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

	public String getAbfahrtsort() {
		return abfahrtsort;
	}

	public void setAbfahrtsort(String abfahrtsort) {
		this.abfahrtsort = abfahrtsort;
	}

	public String getAnkunftsort() {
		return ankunftsort;
	}

	public void setAnkunftsort(String ankunftsort) {
		this.ankunftsort = ankunftsort;
	}

	public Date getAbfahrtszeit() {
		return abfahrtszeit;
	}

	public void setAbfahrtszeit(Date abfahrtszeit) {
		this.abfahrtszeit = abfahrtszeit;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abfahrtszeit == null) ? 0 : abfahrtszeit.hashCode());
		result = prime * result + ((abfahrtsort == null) ? 0 : abfahrtsort.hashCode());
		result = prime * result + ((ankunftsort == null) ? 0 : ankunftsort.hashCode());
		result = prime * result + ((fahrerId == null) ? 0 : fahrerId.hashCode());
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
		if (abfahrtszeit == null) {
			if (other.abfahrtszeit != null)
				return false;
		} else if (!abfahrtszeit.equals(other.abfahrtszeit))
			return false;
		if (abfahrtsort == null) {
			if (other.abfahrtsort != null)
				return false;
		} else if (!abfahrtsort.equals(other.abfahrtsort))
			return false;
		if (ankunftsort == null) {
			if (other.ankunftsort != null)
				return false;
		} else if (!ankunftsort.equals(other.ankunftsort))
			return false;
		if (fahrerId == null) {
			if (other.fahrerId != null)
				return false;
		} else if (!fahrerId.equals(other.fahrerId))
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
