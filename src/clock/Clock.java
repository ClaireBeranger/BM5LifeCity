package clock;

import java.sql.Time; //c'est pas vraiment la bonne librairie mais je chercherais pour trouver celle qui nous faut pour gerer le temps

public class Clock {
	
	public enum DAY {MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY};
	
	private DAY actualDay;
	private Time actualTime;
	private boolean night;
	
	
	public Clock() {
		super();
		this.actualDay = DAY.MONDAY;
		this.actualTime = null;
	}
	
	
	
	
	
	
}
