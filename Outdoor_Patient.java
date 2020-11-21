public class Outdoor_Patient {
	int date_of_appointment;
	double time_of_appointment;
	String doctor;
	int fee;
	public Outdoor_Patient(int dateapp,double timapp,String doc,int fe) {
		date_of_appointment=dateapp;
		time_of_appointment=timapp;
		doctor=doc;
		fee=fe;
	}
	public int getDate_of_appointment() {
		return date_of_appointment;
	}
	public void setDate_of_appointment(int date_of_appointment) {
		this.date_of_appointment = date_of_appointment;
	}
	public double getTime_of_appointment() {
		return time_of_appointment;
	}
	public void setTime_of_appointment(double time_of_appointment) {
		this.time_of_appointment = time_of_appointment;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
}
