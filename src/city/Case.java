package city;

import java.awt.Graphics;


public class Case {
	
	private int noCase;
	private int x;
	private int y;

	public enum type {HOME, STATION, RES_BUILDING, ADMIN_BUILDING, COM_BUILDING} ;  
	
	public Case() {
		
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
