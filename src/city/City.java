package city;

import java.lang.reflect.Array;
import java.util.Arrays;
import clock.Clock;

public class City {


	private String name;
	private int prosperity;
	private int money;
	private int dimX=3;
	private int dimY=3;
	private Districts[][] map = new Districts[dimX][dimY];
	private Clock clock;
	private int nbMaxQuartier;
	
//Constructor of Class -----------------------------------------------------------------------

	public City(String name) {
		super();
		this.name = name;
		this.prosperity = 50;
		this.money = 10000;
		initMap();
		this.clock = new Clock();
		this.nbMaxQuartier = dimX*dimY;
	}
//Functions of class--------------------------------------------------------------------------
	
	public void initMap() {
		//initialisation de la map en une matrice de 9 districts
		for (int i=0; i<dimX;i++) {
			for(int j=0; j<dimY;j++) {
				if(i==0 && j==0) {
					Districts d = new ResidentialArea("res"+i+j);
					map[i][j]=d; 
				}
				if(i==0 && j==1) {
					Districts d = new ShoppingArea("shop"+i+j);
					map[i][j]=d; 
				}
				if(i==0 && j==2) {
					Districts d = new AdministrativeArea("admin"+i+j);
					map[i][j]=d; 
				}
				Districts d = null;
				map[i][j]=d; 					
			}
		}	
	}
	
	public void variationArgent(int x) {
		this.money = this.money + x;
		
	}
	
//Getters and setters of attributes -----------------------------------------------------------------

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
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
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
		return "BEGIN City [\n City_name = " + name + ",\n City_prosperity=" + prosperity + ", City_money=" + money +", dimX=" + dimX + ", dimY=" + dimY 
				+ ",\n nbMaxQuartier=" + nbMaxQuartier + ", clock=" + clock +
				",\n CityDistricts=\n \t" + Arrays.toString(map) +"\nEND City]";
	}

}
