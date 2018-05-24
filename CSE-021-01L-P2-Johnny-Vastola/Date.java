
public class Date {
	private int year;
	private int month;
	private int day;
	Date(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public int compare(Date dt) {
		int yearsDifferenceInDays=Math.abs((dt.getYear()-this.year)*365);
		int daysDifference=Math.abs((dt.dayOfYear()-this.dayOfYear()));
		int totalDifference=Math.abs(yearsDifferenceInDays-daysDifference)/30;
		if(totalDifference>60)
			totalDifference=60;
		return totalDifference;
	}
	public int dayOfYear() {
		int totalDays = 0;
		switch(month) {
			case 12: totalDays += 30;
			case 11: totalDays += 31;
			case 10: totalDays += 30;
			case 9 : totalDays += 31;
			case 8 : totalDays += 31;
			case 7 : totalDays += 30;
			case 6 : totalDays += 31;
			case 5 : totalDays += 30;
			case 4 : totalDays += 31;
			case 3 : totalDays += 28;
			case 2 : totalDays += 31;
		}
		totalDays+=day;
		return totalDays;
		
	}
}
