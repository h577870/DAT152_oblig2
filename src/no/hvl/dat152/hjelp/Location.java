package no.hvl.dat152.hjelp;

public class Location {
	private static String engelsk = "en_US";
	private static String norsk = "no_No";
	private static String spansk = "es_ES";
	
	
	public Location() {
	}
	
	public boolean isValid(String lokasjon) {
		if(lokasjon == "en_US") {
			return true;
		}else if (lokasjon == "no_NO") {
			return true;
		}else if(lokasjon =="es_ES") {
			return true;
		}else {
			return false;
		}
	}
}
