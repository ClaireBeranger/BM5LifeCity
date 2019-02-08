package city;


public class ShoppingArea extends Districts {
//Attributes ---------------------------------------------------------------------------------
	
	private int numbTraders;
	private int numbTradersMax;

//Constructor of Class -----------------------------------------------------------------------
	
public ShoppingArea(String nameDsitrict, String typeDistrict, int numbTraders, int numbTradersMax) {
		super(nameDsitrict, typeDistrict);
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

}
