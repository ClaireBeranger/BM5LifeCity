package city;


public class ShoppingArea implements Districts {
//Attributes ---------------------------------------------------------------------------------
	private String nameDsitrict;
	private String typeDistrict;
	private int numbTraders;
	private int numbTradersMax;
	private int dimX= 4, dimY= 4;
	private Case map[][];
//Constructor of Class -----------------------------------------------------------------------
	
public ShoppingArea(String nameDsitrict, String typeDistrict, int numbTraders, int numbTradersMax) {
		this.nameDsitrict = nameDsitrict;
		this.typeDistrict = typeDistrict;
		this.numbTraders = numbTraders;
		this.numbTradersMax = numbTradersMax;
	}

//Constructors of attributes -----------------------------------------------------------------

	public int getNumbTraders() {
		return numbTraders;
	}
	public void setNumbTraders(int numbTraders) {
		this.numbTraders = numbTraders;
	}
	public int getNumbTradersMax() {
		return numbTradersMax;
	}
	public void setNumbTradersMax(int numbTradersMax) {
		this.numbTradersMax = numbTradersMax;
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
