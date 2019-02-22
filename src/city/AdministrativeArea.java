package city;

import java.util.Arrays;

public class AdministrativeArea implements Districts{
//Attributes ---------------------------------------------------------------------------------
		private String nameDsitrict;
		private String typeDistrict = "ADMINISTRATIVE";
		private int numbWorkers=0;
		private int numbWorkersMax=5;
		private int dimX= 5, dimY= 5;
		private Case[][] map = new Case [dimX][dimY];
		private int coordX, coordY;
		private boolean station;
		private int price = 600;
		private int level = 1;
		private boolean accessibility;
		
//Constructor of Class -----------------------------------------------------------------------

		public AdministrativeArea(String nameDsitrict, int coordX, int coordY) {
			this.nameDsitrict = nameDsitrict;
			this.station = false;
			this.coordX = coordX ;
			this.coordY = coordY ;
			initDistrict();
			
		}
		//Function of class
		
		//on initialise un quartier admin avec 3 admin_building et le reste vide.
		public void initDistrict() {
			
			for (int i=0; i<dimX;i++) {
				for(int j=0; j<dimY;j++) {
					if(i==0 && j<3) { //Trois premières cases avec un batiment administratif
						Case c = new Case(Case.Type.ADMIN_BUILDING,i,j) ;
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
	
		public int getNumbWorkers() {
			return numbWorkers;
		}
		public void setNumbWorkers(int numbWorkers) {
			this.numbWorkers = numbWorkers;
		}
		public int getNumbWorkersMax() {
			return numbWorkersMax;
		}
		public void setNumbWorkersMax(int numbWorkersMax) {
			this.numbWorkersMax = numbWorkersMax;
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

		public int getCoordX() {
			return coordX;
		}

		public void setCoordX(int coordX) {
			this.coordX = coordX;
		}

		public int getCoordY() {
			return coordY;
		}

		public void setCoordY(int coordY) {
			this.coordY = coordY;
		}

		public boolean isStation() {
			return station;
		}

		public void setStation(boolean station) {
			this.station = station;
		}

		public boolean isAccessibility() {
			return accessibility;
		}

		public void setAccessibility(boolean accessibility) {
			this.accessibility = accessibility;
		}
//---------------------------------------------------------------
		
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
			return "BEGIN AdministrativeArea [\n nameDsitrict=" + nameDsitrict + ", typeDistrict=" + typeDistrict
					+ ", numbWorkers=" + numbWorkers + ", numbWorkersMax=" + numbWorkersMax + ", dimX=" + dimX
					+ ", dimY=" + dimY + ", price=" + price + ",\n map=" + toStringCases(map) + "\nEND AdministrativeArea]";
		}

}
