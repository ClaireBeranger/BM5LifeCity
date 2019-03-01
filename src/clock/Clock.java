package clock;

import java.sql.Time; //c'est pas vraiment la bonne librairie mais je chercherais pour trouver celle qui nous faut pour gerer le temps
import java.util.concurrent.TimeUnit;


public class Clock {	//creation of the clock
	private boolean started;
	private int hour;
	private int minute;
	private int day;
	private int month;
	private int year;
	
	
	public Clock(){
		hour = 8;
		minute = 30;
		day = 31;
		month = 03;
		year = 2019;
	}
	
	public Clock(int hH, int mm, int dD, int mM2, int yYYY) {
		super();
		hour = hH;
		this.minute = mm;
		day = dD;
		month = mM2;
		year = yYYY;
	}
	
	public String getHour() {		//getters ->
		if (hour<10)
			return "" + 0 + hour;
		else{
			return "" + hour;
		}
	}

	public String getMinute() {
		if (minute<10)
			return "" + 0 + minute;
		else{
			return "" + minute;
		}
	}

	public String getDay() {
		if (day<10)
			return "" + 0 + day;
		else{
			return "" + day;
		}
	}

	public String getMonth() {
		if (month<10)
			return "" + 0 + month;
		else{
			return "" + month;
		}
	}


	public int getYear() {		//<-
		return year;
	}


	public void start(){		//start the clock
		started  = true;
		while (started==true){
			this.increment();
		}
	}
	
	public void increment(){	//increment the clock by 1 minute
		if (minute + 1 == 60){
			minute = 0;
			if(hour + 1 == 24){
				hour = 0;
				if((day + 1 == 29 && isFev()) || (day + 1 == 31 && is30()) || (day + 1 == 32 && is31()) ){
					day = 01;
					if(month + 1 == 13){
						month = 01;
						year += 1;
					}
					else{
						month += 1;
					}
				}
				else{
					day += 1;
				}
			}
			else{
				hour += 1;
			}
		}
		else{
			minute += 1;
		}
	}

	private boolean is30() {		//return true if the current month has 30 days
		if(month==04||month==06||month==9||month==11){
			return true;
		}else{
			return false;			
		}
	}


	private boolean isFev() {		//return true if the current month is february
		if(month == 02){
			return true;
		}else{
			return false;			
		}
	}


	private boolean is31() {		//return true if the current month has 31 days
		if(month==01||month==03||month==05||month==07||month==8||month==10||month==11||month==12){
			return true;
		}else{
			return false;			
		}
	}

	public String toStringHour() {
		return  getHour() + ":" + getMinute() ;
	}
	public String toStringDate() {
		return  getDay() + "/" + getMonth() + "/" + getYear();
	}

	
	
}
