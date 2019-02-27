package city;

import java.util.ArrayList;
import city.Citizen.TimeWork;
import clock.Clock;

/**
 * Class that manages the functioning of the city and its prosperity. 
 * @author BM5 Corporation
 */

public class City {


	private String name;
	private int prosperity;
	private int money;
	private int dimX=10;
	private int dimY=10;
	public Districts[][] map = new Districts[dimX][dimY];
	public ArrayList<Citizen> citizens = new ArrayList<Citizen>();
	
	private Clock clock;
	private int nbMaxQuartier;
	
	
//Constructor of Class -----------------------------------------------------------------------

	/**
	 * Create a city with a name in parameter, and a prosperity of 50, a money of 1000$ in the beginning
	 * and initialize the map of the city with 10x10 districts
	 * @param name : the name of the city 
	 */
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
	
	/**
	 * Initialization of the map of districts (10x10). 
	 * Repartition and initialization of 9 districts in the 3x3 firsts cases of the city : 
	 * 5 residential areas, 2 administrative area and 2 shopping areas.
	 */
	public void initMap() { 
		
		for (int i=0; i<dimX;i++) {
			for(int j=0; j<dimY;j++) {
				
				if((i==0 && j==0) || (i==1 && j==1) || (i==2 && j==2) || (i==0 && j==2) || (i==2 && j==0) ) {
					this.map[i][j] = new ResidentialArea("res"+i+j, i,j); 
					addCitizensInDistrict((ResidentialArea) this.map[i][j]);
				}
				else if( (i==1 && j==0) || (i==1 && j==2) ) {
					this.map[i][j] = new ShoppingArea("shop"+i+j, i,j);
				}
				else if( (i==0 && j==1) || (i==2 && j==1) ) {
					this.map[i][j] = new AdministrativeArea("admin"+i+j, i,j);
				}
				else {
					this.map[i][j] = null;
				} 					
			}
		}		
	}
	
	/**
	 * Add 10 citizens inside the residential district in parameter, 
	 * and initialize the workPlace and the timeWork district of every citizen. 
	 * 
	 * @param district : residential districts 
	 * 
	 * @details 5 will work in PM and 5 will work in AM : 
	 * 3 of the AM workers will work in the admin area and 2 in the shopping area, 
	 * 3 of the PM workers will work in the shopping area and 2 in the admin area.  
	 */
	public void addCitizensInDistrict(ResidentialArea district) {
		
		citizens.add(new Citizen(district, closestAdminArea(district), TimeWork.AM));
		citizens.add(new Citizen(district, closestAdminArea(district), TimeWork.AM));
		citizens.add(new Citizen(district, closestAdminArea(district), TimeWork.AM));
		//++
		citizens.add(new Citizen(district, closestShopArea(district), TimeWork.AM));
		citizens.add(new Citizen(district, closestShopArea(district), TimeWork.AM));
		
		
		citizens.add(new Citizen(district, closestShopArea(district), TimeWork.PM));
		citizens.add(new Citizen(district, closestShopArea(district), TimeWork.PM));
		citizens.add(new Citizen(district, closestShopArea(district), TimeWork.PM));
		//++
		citizens.add(new Citizen(district, closestAdminArea(district), TimeWork.PM));
		citizens.add(new Citizen(district, closestAdminArea(district), TimeWork.PM));
		
	}
	
	/**
	 * Search the closest administrative district from a current district
	 * @param currentD : the current district 
	 * @return the closest administrative district 
	 */
	public Districts closestAdminArea(Districts currentD) {
		return null;
		
	}
	
	/**
	 * Search the closest shopping district from a current district
	 * @param currentD : the current district 
	 * @return the closest shopping district 
	 */
	public Districts closestShopArea(Districts currentD) {
		return null;
		
	}
	
	/**
	 * Evaluate the variation of the money of the city
	 * @param x : gain or loss of money
	 */
	public void variationMoney(int x) {
		this.money = this.money + x;
		
	}
	
	
	/**
	 * Evaluate the accessibility of a district. Check the neighbors districts 
	 * and evaluate if the citizen of this district will can travel from or to this district.
	 * @param d : district to be tested
	 * @return TRUE if it's an accessible district, FALSE if not.
	 */
	public boolean AccesibleDistricts(Districts d) {
		try {
			d.setAccessibility(false);
			
			if ((map[d.getCoordX()][d.getCoordY()]).isStation()) //Verification LOCAL
				d.setAccessibility(true);
		
			if ((map[d.getCoordX()+1][d.getCoordY()]).isStation()) //Verification TOP
				d.setAccessibility(true);
			
			if ((map[d.getCoordX()-1][d.getCoordY()]).isStation()) //Verifiation BOTTOM
				d.setAccessibility(true);
			
			if ((map[d.getCoordX()][d.getCoordY()+1]).isStation()) //Verifiation RIGHT
				d.setAccessibility(true);
			
			if ((map[d.getCoordX()][d.getCoordY()-1]).isStation()) //Verifiation LEFT 
				d.setAccessibility(true);
			
			
		}
		catch(IndexOutOfBoundsException e) {
		    System.err.println("IndexOutOfBoundsException: " + e.getMessage());

		}
		
		return d.isAccessibility();
		
	}
	
	/**
	 * Manage the travel of all the citizen of the city to their work.
	 * Those who work in AM will travel at 8:00 in the clock and those who work in PM will travel at 12:00 in the clock
	 * @param citizen : list of all the citizens of the city
	 */
	public void travelCitizenToWork( ArrayList<Citizen> citizen ) {
		
		for(Citizen c : citizen) {
		
			if(this.AccesibleDistricts(c.getWorkplace())) {
				
				c.TravelToWork();
				//touche pas juste push le moi et je continuerai inshaAllah. oumss.
			}
			else {
				
			}

		}
	}
	
	/**
	 * Manage the travel of all the citizen of the city to their home after work.
	 * Those who work in AM will travel at 12:00 and those who work in PM will travel at 17:00
	 * @param citizen : list of all the citizens of the city
	 */
	public void travelCitizenToHome( ArrayList<Citizen> citizen ) {
		
		for(Citizen c : citizen) {
		
			if(this.AccesibleDistricts(c.getWorkplace())) {
				
				c.TravelToWork();
				//touche pas juste push le moi et je continuerai inshaAllah. oumss.
			}
			else {
				
			}

		}
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

	
//---------------------------------------------------------------------
	
	public String toStringDistricts(Districts[][] map) {
		String str= "";
		for(int i=0; i<dimX;i++) {
			for(int j=0; j<dimY;j++) {
				if(map[i][j] != null)
					str=str+"\n"+map[i][j].toString()+"\n";			
			}
		}
		return str;	
	}
	
	@Override
	public String toString() {
		return "BEGIN City [\n City_name = " + name + ",\n City_prosperity=" + prosperity + ", City_money=" + money +", dimX=" + dimX + ", dimY=" + dimY 
				+ ",\n nbMaxQuartier=" + nbMaxQuartier + ", clock=" + clock +
				",\n CityDistricts=\n \t" + toStringDistricts(getMap()) +"\nEND City]";
	}

}
