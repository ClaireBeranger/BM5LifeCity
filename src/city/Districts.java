package city;

public class Districts {
//Attributes ---------------------------------------------------------------------------------

	private String nameDsitrict;
	private String typeDistrict;
	
//Constructor of Class -----------------------------------------------------------------------
	
	public Districts(String nameDsitrict, String typeDistrict) {
		super();
		this.nameDsitrict = nameDsitrict;
		this.typeDistrict = typeDistrict;
	}
	
//Constructors of attributes -----------------------------------------------------------------
	
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
