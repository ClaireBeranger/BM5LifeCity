package city;

public class AdministrativeArea implements Districts{
//Attributes ---------------------------------------------------------------------------------
		private String nameDsitrict;
		private String typeDistrict;
		private int numbWorkers;
		private int numbWorkersMax;
		private int dimX= 4, dimY= 4;
		private Case map[][];
//Constructor of Class -----------------------------------------------------------------------

		public AdministrativeArea(String nameDsitrict, String typeDistrict, int numbWorkers, int numbWorkersMax) {
			this.nameDsitrict = nameDsitrict;
			this.typeDistrict = typeDistrict;
			this.numbWorkers = numbWorkers;
			this.numbWorkersMax = numbWorkersMax;
		}
		//Function of class
		public void initDistrict() {
			for (int i=0; i<dimX;i++) {
				for(int j=0; j<dimY;j++) {
					//Districts d = new District(); //attente du constructeur d'un district
					Case d = new Case() ;
					map[i][j]=d; 					
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
}
