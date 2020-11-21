public class Date {
	private String day;
	private int month;
	private int year;
	public Date(String d,int m,int y) {
		day=d;
		month=m;
		year=y;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
