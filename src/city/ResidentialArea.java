package city;

import city.Districts;

import java.util.Arrays;

import city.Case;

public class ResidentialArea implements Districts{
//Attributes ---------------------------------------------------------------------------------
	private String nameDsitrict;
	private String typeDistrict = "RESIDENTIAL";
	private int numbResidentsCurrent;
	private int numbResidentsMax;
	private int dimX= 4, dimY= 4;
	private Case[][] map = new Case [dimX][dimY];
	private int price = 500;
	

//Constructor of Class -----------------------------------------------------------------------
	
	public ResidentialArea(String nameDsitrict) {
		this.nameDsitrict = nameDsitrict;
		initDistrict();
	}
//Function of class ----------------------------------------------------------------------------
	
	
	//on initialise un quartier residentiel avec 3 home et le reste vide.
	public void initDistrict() {
		
		for (int i=0; i<dimX;i++) {
			for(int j=0; j<dimY;j++) {
				if(i==0 && j<3) { //Trois premières cases avec une maison
					Case c = new Case(Case.Type.HOME,i,j) ;
					map[i][j]=c;
				}
				else { //Les autres cases avec null
					Case c = new Case(Case.Type.NOTHING,i,j) ;
					map[i][j]=c; 	//-----
				}
			}	
		}
	}
//Getters and setters of attributes -----------------------------------------------------------------
	
	public int getNumbResidentsCurrent() {
		return numbResidentsCurrent;
	}
	public void setNumbResidentsCurrent(int numbResidentsCurrent) {
		this.numbResidentsCurrent = numbResidentsCurrent;
	}
	
	public int getNumbResidentsMax() {
		return numbResidentsMax;
	}
	public void setNumbResidentsMax(int numbResidentsMax) {
		this.numbResidentsMax = numbResidentsMax;
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
		String tmp = "BEGIN ResidentialArea [\n nameDsitrict=" + nameDsitrict + ", typeDistrict=" + typeDistrict
					+ ",\n numbResidentsCurrent=" + numbResidentsCurrent + ", numbResidentsMax=" + numbResidentsMax
					+ ", dimX=" + dimX + ", dimY=" + dimY + ", price=" + price 
					+ ",\n map=" + Arrays.toString(map) + "\nEND ResidentialArea ]";
	
	return tmp;
	}
	
	
	
	
}

