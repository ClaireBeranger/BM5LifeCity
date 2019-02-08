package city;

import city.Districts;

public class ResidentialArea extends Districts{
//Attributes ---------------------------------------------------------------------------------

	private int numbResidents;
	private int numbResidentsMax;
	

//Constructor of Class -----------------------------------------------------------------------
	
	public ResidentialArea(String nameDsitrict, String typeDistrict, int numbResidents, int numbResidentsMax) {
		super(nameDsitrict, typeDistrict);
		this.numbResidents = numbResidents;
		this.numbResidentsMax = numbResidentsMax;
	}
	
//Constructors of attributes -----------------------------------------------------------------
	
	public int getNumbResidents() {
		return numbResidents;
	}
	public void setNumbResidents(int numbResidents) {
		this.numbResidents = numbResidents;
	}
	public int getNumbResidentsMax() {
		return numbResidentsMax;
	}
	public void setNumbResidentsMax(int numbResidentsMax) {
		this.numbResidentsMax = numbResidentsMax;
	}
	
	
}

