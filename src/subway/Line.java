package subway;

import java.util.ArrayList;
import city.*;

public class Line {
	
	private String nameLine;
	private ArrayList stations = new ArrayList<Station>();
	private int timeTraject;
	private Case[][] map = new Case [4][4];
	

	public Line(String nameLine) {
		super();
		this.nameLine = nameLine;
	} 
	
	
	public void travelFromTo(Station source, Station dest ) {
		
		
	}
	
	
	
	
}
