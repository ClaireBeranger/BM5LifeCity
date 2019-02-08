package motor;

import city.City;
import city.Districts;
import clock.Clock;

public class Motor {
	
	
public static void main(String[] args) {
		
		Districts map[][] = null ;  
		Clock clock = null;
		City s1 = new City("fares", 3000, 3000, map, clock, 4);
		System.out.println(s1);
	}
	
	
}
