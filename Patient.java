public class Patient{
	String name;
	int cnic;
	String address;
	int phone_no;
	char gender;
	int age;
	public Patient(String na,int ci,int pno,char chr,int ge) {
			name=na;
			cnic=ci;
			phone_no=pno;
			gender=chr;
		    age=ge;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	}
