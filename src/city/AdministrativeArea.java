package city;

public class AdministrativeArea extends Districts{
//Attributes ---------------------------------------------------------------------------------
	
		private int numbWorkers;
		private int numbWorkersMax;
		
//Constructor of Class -----------------------------------------------------------------------

		public AdministrativeArea(String nameDsitrict, String typeDistrict, int numbWorkers, int numbWorkersMax) {
			super(nameDsitrict, typeDistrict);
			this.numbWorkers = numbWorkers;
			this.numbWorkersMax = numbWorkersMax;
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
}
