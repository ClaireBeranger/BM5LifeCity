package city;
 
public interface Districts {

	
	public void initDistrict() ;
	
	
	public String getNameDsitrict() ;
	
	public void setNameDsitrict(String nameDsitrict);
	
	public String getTypeDistrict() ;
	
	public void setTypeDistrict(String typeDistrict) ;
	
	public boolean AccesibleDistricts(String nameDsitrict);
	@Override
	public String toString();
}
