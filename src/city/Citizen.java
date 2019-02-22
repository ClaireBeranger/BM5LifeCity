package city;
import subway.*;

import java.sql.Time;
import java.util.ArrayList;

public class Citizen {
	//Attributes ---------------------------------------------------------------------------------
	
		private	Districts spot;
		private Districts workplace;
		
	
		
	//Constructor of Class -----------------------------------------------------------------------
		
		public Citizen(Districts spot,Districts workplace ) {
			this.spot = spot;
			this.workplace = workplace;
			
		
		}
	//Functions of class--------------------------------------------------------------------------
		
		public ArrayList<Station> TravelToWork () {
			
			ArrayList<Station> array = null;
			
			return array;
		}
		

	//Constructors of attributes -----------------------------------------------------------------
		public Districts getSpot() {
			return spot;
		}
		public void setSpot(Districts spot) {
			this.spot = spot;
		}
		
		public Districts getWorkplace() {
			return workplace;
		}
		public void setWorkplace(Districts workplace) {
			this.workplace = workplace;
		}
		
}
