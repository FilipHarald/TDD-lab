package part2.clock;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	public Time(){
		hour = 0;
		minute = 0;
		second = 0;
	}
	
	public Time(int hour, int minute, int second) {
		timeSet(hour, minute, second);
	}
	
	public String timeSet(int hour, int minute, int second){
		if(validInput(hour, minute, second)){	
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}
		return showTime();
	}
		
	public String showTime(){
		return "" + String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second);
	}
	
	private boolean validInput(int hour, int minute, int second) {
		if(hour >= 0 && hour <= 59 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59){
			return true;
		}
		return false;
	}
}
