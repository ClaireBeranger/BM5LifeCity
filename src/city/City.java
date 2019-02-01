package city;

import java.util.Arrays;

import clock.Clock;

public class City {
	
	private String name;
	private int prosperity;
	private int argent;
	private int map[][];
	private Clock clock;
	private int nbMaxQuartier;
	
	
	public City(String name, int prosperity, int argent, int[][] map, Clock clock, int nbMaxQuartier) {
		super();
		this.name = name;
		this.prosperity = prosperity;
		this.argent = argent;
		this.map = map;
		this.clock = clock;
		this.nbMaxQuartier = nbMaxQuartier;
	}

	public void initMap() {
		
	}
	
	public void variationArgent(int x) {
		this.argent = this.argent + x;
		
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getProsperity() {
		return prosperity;
	}


	public void setProsperity(int prosperity) {
		this.prosperity = prosperity;
	}


	public int getArgent() {
		return argent;
	}


	public void setArgent(int argent) {
		this.argent = argent;
	}


	public int[][] getMap() {
		return map;
	}


	public void setMap(int[][] map) {
		this.map = map;
	}


	public Clock getClock() {
		return clock;
	}


	public void setClock(Clock clock) {
		this.clock = clock;
	}


	public int getNbMaxQuartier() {
		return nbMaxQuartier;
	}


	public void setNbMaxQuartier(int nbMaxQuartier) {
		this.nbMaxQuartier = nbMaxQuartier;
	}
	
	
	
	@Override
	public String toString() {
		return "City [name=" + name + ", prosperity=" + prosperity + ", argent=" + argent + ", map="
				+ Arrays.toString(map) + ", clock=" + clock + ", nbMaxQuartier=" + nbMaxQuartier + "]";
	}


	
	
}
