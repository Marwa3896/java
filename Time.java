public class Time {
	private int hours;
	private int mins;
	private String am;

	public Time(int h,int mi,String pm) {
		hours=h;
		mins=mi;
		am=pm;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMins() {
		return mins;
	}
	public void setMins(int mins) {
		this.mins = mins;
	}
	public String getAm() {
		return am;
	}
	public void setAm(String am) {
		this.am = am;
	}

}
