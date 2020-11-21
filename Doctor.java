public class Doctor {
	private String name;
	private int cnic;
	private int phone_no;
	private char gender;
	private String  department;
	private String specialization;

	public Doctor(String n,int c,int ph,char ch,String dep,String sp) {
		name=n;
		cnic=c;
		phone_no=ph;
		gender=ch;
	    department=dep;
		specialization=sp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCnic() {
		return cnic;
	}

	public void setCnic(int cnic) {
		this.cnic = cnic;
	}

	public int getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

}
