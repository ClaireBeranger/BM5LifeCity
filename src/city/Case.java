package city;

public class Case {


	private int noCase;
	private int x;
	private int y;
	private Type type;
	
	public enum Type {NOTHING ,HOME, STATION, RES_BUILDING, ADMIN_BUILDING, COM_BUILDING, STORE } ;  
	
	public Case(int noCase, int x, int y , Type type) {
		this.noCase = noCase;
		this.x = x ;
		this.y = y ;
		this.type= type;
	}
		

	public int getNoCase() {
		return noCase;
	}

	public void setNoCase(int noCase) {
		this.noCase = noCase;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
