package city;

import java.util.Arrays;
import clock.Clock;

public class City {
	
	private String name;
	private int prosperity;
	private int argent;
	private int dimX=3;
	private int dimY=3;
	private Districts map[][];
	private Clock clock;
	private int nbMaxQuartier;
	
	
	public City(String name, int prosperity, int argent, Districts[][] map, Clock clock, int nbMaxQuartier) {
		super();
		this.name = name;
		this.prosperity = prosperity;
		this.argent = argent;
		this.map = map;
		this.clock = clock;
		this.nbMaxQuartier = nbMaxQuartier;
	}

	public void initMap() {
		//initialisation de la map en une matrice de 9 districts
		for (int i=0; i<dimX;i++) {
			for(int j=0; j<dimY;j++) {
				//Districts d = new District(); //attente du constructeur d'un district
				Districts d = null ;
				map[i][j]=d; 					
			}
		}	
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


	public Districts[][] getMap() {
		return map;
	}


	public void setMap(Districts[][] map) {
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
