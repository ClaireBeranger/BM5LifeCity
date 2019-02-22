package city;
 
public interface Districts {

	
	public void initDistrict() ;

	//districts
	
	public String getNameDsitrict();
	public void setNameDsitrict(String nameDsitrict) ;
	
	public String getTypeDistrict() ;
	public void setTypeDistrict(String typeDistrict) ;

	public Case[][] getMap() ;
	public void setMap(Case[][] map) ;

	public int getPrice() ;
	public void setPrice(int price) ;
	
	public int getLevel() ;
	public void setLevel(int level);

	public int getCoordX() ;
	public void setCoordX(int coordX) ;
//
	public int getCoordY() ;

	public void setCoordY(int coordY) ;

	public boolean isStation() ;
	public void setStation(boolean station);

	public boolean isAccessibility() ;
	public void setAccessibility(boolean accessibility);
	
	@Override
	public String toString();
}
