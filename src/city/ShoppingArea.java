package city;

import java.util.Arrays;

import city.Case;


public class ShoppingArea implements Districts {
//Attributes ---------------------------------------------------------------------------------
	private String nameDsitrict;
	private String typeDistrict;
	private int numbTraders;
	private int numbTradersMax;
	private int dimX= 4, dimY= 4;
	private Case[][] map = new Case [dimX][dimY];
	private int price = 40;
	
//Constructor of Class -----------------------------------------------------------------------
	
public ShoppingArea(String nameDsitrict) {
		this.nameDsitrict = nameDsitrict;
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

	@Override
	public String toString() {
		return "BEGIN ShoppingArea [\n nameDsitrict=" + nameDsitrict + "\n, typeDistrict=" + typeDistrict + ",\n numbTraders="
				+ numbTraders + ",\n numbTradersMax=" + numbTradersMax + ",\n dimX=" + dimX + ",\n dimY=" + dimY + ", map="
				+ Arrays.toString(map) + ",\n price=" + price + "\nEND ShoppingArea]";
	}
	
	
	
}
