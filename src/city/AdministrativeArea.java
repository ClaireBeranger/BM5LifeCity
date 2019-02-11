package city;

import java.util.Arrays;

public class AdministrativeArea implements Districts{
//Attributes ---------------------------------------------------------------------------------
		private String nameDsitrict;
		private String typeDistrict;
		private int numbWorkers;
		private int numbWorkersMax;
		private int dimX= 4, dimY= 4;
		private Case[][] map = new Case [dimX][dimY];
		private int price = 600;
		
//Constructor of Class -----------------------------------------------------------------------

		public AdministrativeArea(String nameDsitrict) {
			this.nameDsitrict = nameDsitrict;
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

		
		@Override
		public String toString() {
			return "BEGIN AdministrativeArea [\n nameDsitrict=" + nameDsitrict + ",\n typeDistrict=" + typeDistrict
					+ ",\n numbWorkers=" + numbWorkers + ",\n numbWorkersMax=" + numbWorkersMax + ",\n dimX=" + dimX
					+ ",\n dimY=" + dimY + ",\n map=" + Arrays.toString(map) + ",\n price=" + price + "\nEND AdministrativeArea]";
		}

}
