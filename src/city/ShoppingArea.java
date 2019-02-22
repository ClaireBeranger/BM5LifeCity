package city;

import java.util.Arrays;

import city.Case;


public class ShoppingArea implements Districts {
//Attributes ---------------------------------------------------------------------------------
	private String nameDsitrict;
	private String typeDistrict = "SHOPPING";
	private int numbTraders=0;
	private int numbTradersMax=50;
	private int dimX= 5, dimY= 5;
	private Case[][] map = new Case [dimX][dimY];
	private int coordX, coordY;
	private boolean station;
	private int price = 40;
	private int level = 1;
	private boolean accessibility;
	
//Constructor of Class -----------------------------------------------------------------------
	
public ShoppingArea(String nameDsitrict, int coordX, int coordY) {
		this.nameDsitrict = nameDsitrict;
		this.station = false;
		this.coordX = coordX ;
		this.coordY = coordY ;
		initDistrict();
	}
//Function of class

	//on initialise un quartier shop avec 3 store et le reste vide.
	public void initDistrict() {
		
		for (int i=0; i<dimX;i++) {
			for(int j=0; j<dimY;j++) {
				if(i==0 && j<3) { //Trois premières cases avec un magasin
					Case c = new Case(Case.Type.STORE,i,j) ;
					map[i][j]=c;
				}
				else { //Les autres cases avec null
					Case c = new Case(Case.Type.NOTHING,i,j) ;
					map[i][j]=c; 	//-----
				}
			}	
		}
	}
	
	//Verification de l'accessibilité d'un quartier
	public boolean AccesibleDistricts(String nameDsitrict) {
			accessibility = false;
		
			if (existStation(map[this.Districts.x+1][this.Districts.y+1]))
				accessibility = true;
			
			if (existStation(map[this.Districts.x-1][this.Districts.y+1]))
				accessibility = true;
			
			if (existStation(map[this.Districts.x][this.Districts.y+1]))
				accessibility = true;
			
			if (existStation(map[this.Districts.x][this.Districts.y-1]))
				accessibility = true;
			
			return accessibility;
		}
//Constructors of attributes -----------------------------------------------------------------

	public int getNumbTraders() {
		return numbTraders;
	}
	public void setNumbTraders(int numbTraders) {
		this.numbTraders = numbTraders;
	}
	public int getNumbTradersMax() {
		return numbTradersMax;
	}
	public void setNumbTradersMax(int numbTradersMax) {
		this.numbTradersMax = numbTradersMax;
	}
	public String getNameDsitrict() {
		return nameDsitrict;
	}
	public void setNameDsitrict(String nameDsitrict) {
		this.nameDsitrict = nameDsitrict;
	}
	
	public String getTypeDistrict() {
		return typeDistrict;
	}
	public void setTypeDistrict(String typeDistrict) {
		this.typeDistrict = typeDistrict;
	}

	public Case[][] getMap() {
		return map;
	}
	public void setMap(Case[][] map) {
		this.map = map;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String toStringCases(Case[][] map) {
		String str = "";
		for(int i=0; i<dimX;i++) {
			for(int j=0; j<dimY;j++) {
				if(map[i][j] != null)
					str=str+map[i][j].toString();			
			}
		}
		return str;
	}
	
	@Override
	public String toString() {
		return "BEGIN ShoppingArea [\n nameDsitrict=" + nameDsitrict + ", typeDistrict=" + typeDistrict + ", numbTraders="
				+ numbTraders + ", numbTradersMax=" + numbTradersMax + ", dimX=" + dimX + ", dimY=" + dimY + ",\n price=" + price 
				+ ", map=" + toStringCases(map)+ "\nEND ShoppingArea]";
	}
	
	
	
}
