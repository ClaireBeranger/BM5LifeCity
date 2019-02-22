package city;
 
public interface Districts {

	
	public void initDistrict() ;
	
	
	public String getNameDsitrict() ;
	
	public void setNameDsitrict(String nameDsitrict);
	
	public String getTypeDistrict() ;
	
	public void setTypeDistrict(String typeDistrict) ;
	
	public void setAccessibility(boolean accessibility);
	
	@Override
	public String toString();
}
