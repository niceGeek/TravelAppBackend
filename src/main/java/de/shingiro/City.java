/**
 * 
 */
package de.shingiro;

/**
 * Enum class representing all available cities
 * @author angedesires
 *
 */
public enum City {
	
	KIGALI("Kigali"),
	GITARAMA("Gitarama"),
	BUTARE("Butare"),
	GIKONGORO("Gikongoro"),
	CYANGUGU("Cyangugu"),
	KIBUYE("Kibuye"),
	GISENYI("Gisenyi"),
	RUHENGERI("Ruhengeri"),
	BYUMBA("Byumba"),
	KIBUNGO("Kibungo"),
	MUTARA("Mutara");
	
	private String city;
	
	City(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}

}
