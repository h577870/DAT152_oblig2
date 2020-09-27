package no.hvl.dat152.hjelp;

public class Location {
	private static String engelsk = "en_US";
	private static String norsk = "no_NO";
	private static String spansk = "es_ES";
	
	
	public Location() {
	}
	
	public boolean isValid(String lokasjon) {
		if(lokasjon.equals(engelsk)) {
			return true;
		}else if (lokasjon.equals(norsk)) {
			return true;
		}else if(lokasjon.equals(spansk)) {
			return true;
		}
			return false;
		
	}
}
