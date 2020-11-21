public class Indoor_Patient{
	int wardno;
	int Roomno;
	int bedno;
	String doctor;
	int date_of_admission;
	int fee;
	public Indoor_Patient(int wno,int rno,int bno,String dt,int dateof,int fes) {
		int wardno=wno;
		int Roomno=rno;
		int bedno=bno;
		String doctor=dt;
		int date_of_admission=dateof;
		int fee=fes;
	}
	public int getWardno() {
		return wardno;
	}
	public void setWardno(int wardno) {
		this.wardno = wardno;
	}
	public int getRoomno() {
		return Roomno;
	}
	public void setRoomno(int roomno) {
		Roomno = roomno;
	}
	public int getBedno() {
		return bedno;
	}
	public void setBedno(int bedno) {
		this.bedno = bedno;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public int getDate_of_admission() {
		return date_of_admission;
	}
	public void setDate_of_admission(int date_of_admission) {
		this.date_of_admission = date_of_admission;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}

}
