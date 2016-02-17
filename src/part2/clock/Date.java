package part2.clock;

public class Date {
	private int year;
	private int month;
	private int day;
	
	public Date() {
		year = 2000;
		month = 1;
		day = 1;
	}
	
	public Date(int year, int month, int day) {
		dateSet(year, month, day);
	}
	
	public String dateSet(int year, int month, int day) {
		if(validInput(year, month, day)){
			this.year = year;
			this.month = month;
			this.day = day;			
		}
		return showDate();
	}
	
	public String showDate() {
		return "" + year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day);
	}
	
	private boolean validInput(int year, int month, int day) {
		if(year >= 2000 && year <= 2100 && month >= 1 && month <= 12 && day >= 1 && day <= 31){
			return true;
		}
		return false;
	}
}
