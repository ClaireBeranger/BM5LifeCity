package subway;

import java.util.ArrayList;
import city.*;

public class Line {
	
	private String nameLine;
	private Station start ; 
	
	private Station arrive ;
	private int timeTraject;
	private Case[][] map = new Case [4][4];
	

	public Line(String nameLine, Station source, Station destination) {
		super();
		this.nameLine = nameLine;
		this.start = start ;
		this.arrive=arrive;
	} 
	
	
	//dans la classe Citizen plutot 
	public void travel(Station source, Station dest ) {
		
	}
	
	
	
	
}
