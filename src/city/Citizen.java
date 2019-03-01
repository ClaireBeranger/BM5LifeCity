package city;

import subway.*;



import java.sql.Time;

import java.util.ArrayList;



public class Citizen {

	

		/**
		 * Type which define if a citizen work in the morning AM or in the afternoon PM.
		 */

		public enum TimeWork {AM , PM} ;

//Attributes ---------------------------------------------------------------------------------

		

		/**Home district of the citizen **/

		private	Districts spot; 

		/**Working district of the citizen **/

		private Districts workplace;

		/**Time of working of the citizen {AM or PM} **/

		private TimeWork workingTime ;

	

		

//Constructor of Class -----------------------------------------------------------------------

		

		public Citizen(Districts spot,Districts workplace, TimeWork workingTime ) {

			this.spot = spot;

			this.workplace = workplace;
			
			this.setWorkingTime(workingTime);

		}

		public Citizen(Districts spot ) {

			this.spot = spot;

		}

		

		

//Functions of class--------------------------------------------------------------------------

		public ArrayList<Station> TravelToWork () {	

			ArrayList<Station> array = null;
			return array;

		}

//Getters and Setters of attributes -----------------------------------------------------------------

		

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

		public TimeWork getWorkingTime() {

			return workingTime;

		}

		public void setWorkingTime(TimeWork workingTime) {

			this.workingTime = workingTime;

		}

		

}