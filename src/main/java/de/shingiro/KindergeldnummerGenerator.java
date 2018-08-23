package de.shingiro;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 */

/**
 * Utility class for generating a random kindergeldnummer
 * 
 * @author a.shingiro
 *
 */
public class KindergeldnummerGenerator {

	/**
	 * @param args
	 */

	String kindergeldNummer = "";

	final String COMMON_PART = "FK";

	public String erzeugeKindergeldNummer() {
		kindergeldNummer = generateRandomNumber(100, 999) + COMMON_PART + generateRandomNumber(100000, 999999);
		return kindergeldNummer;
	}

	final int generateRandomNumber(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}

}
