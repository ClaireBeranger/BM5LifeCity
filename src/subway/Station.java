package subway;

import city.Districts;
import java.util.ArrayList;

public class Station {

	private String nameStation;
	private ArrayList<Districts> districtRelied = new ArrayList<Districts>();
	
	
	
	public Station(String nameStation) {
		super();
		this.nameStation = nameStation;
	}



	public String getNameStation() {
		return nameStation;
	}

	public void setNameStation(String nameStation) {
		this.nameStation = nameStation;
	}

	public ArrayList<Districts> getDistrictRelied() {
		return districtRelied;
	}
	
	public void setDistrictRelied(ArrayList<Districts> districtRelied) {
		this.districtRelied = districtRelied;
	} 
	
	
	
	

}
