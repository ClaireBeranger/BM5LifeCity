package city;
import subway.*;

import java.sql.Time;
import java.util.ArrayList;

public class Citizen {
	//Attributes ---------------------------------------------------------------------------------
		TypeWork enum 
	
		private TimeWork timeWork;
		private	Districts spot; //Home
		private Districts workplace; //Work
		
	
		
	//Constructor of Class -----------------------------------------------------------------------
		
<<<<<<< HEAD
		/**
		 * Constructor of a Citizen
		 * @param spot district of living of the citizen
		 * @param workplace district of work of the citizen
		 * @param workingTime time of work of the citizen AM or PM 
		 */
		public Citizen(Districts spot,Districts workplace, TimeWork workingTime ) {
=======
		public Citizen(Districts spot,Districts workplace ) {
>>>>>>> branch 'master' of https://github.com/ClaireBeranger/BM5LifeCity
			this.spot = spot;
			this.workplace = workplace;
<<<<<<< HEAD
			this.setWorkingTime(workingTime);
=======
			
		
>>>>>>> branch 'master' of https://github.com/ClaireBeranger/BM5LifeCity
		}
<<<<<<< HEAD
		
		/**
		 * Constructor of a Citizen
		 * @param spot district of living of the citizen
		 */
		public Citizen(Districts spot ) {
			this.spot = spot;
		}
=======
	//Functions of class--------------------------------------------------------------------------
>>>>>>> branch 'master' of https://github.com/ClaireBeranger/BM5LifeCity
		
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
