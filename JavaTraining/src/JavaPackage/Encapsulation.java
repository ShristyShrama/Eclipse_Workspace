package JavaPackage;

public class Encapsulation {

	// 1. Data must be private
	private int ssn;
	private String empname;
	private int empage;

	public static void main(String[] args) {
		Encapsulation emp=new Encapsulation();
	    emp.setSsn(123456);
	    emp.setEmpage(25);
	    emp.setEmpname("Tom");
        System.out.println("SSN no. is "+emp.getSsn());
        System.out.println("Employe age is "+emp.getEmpage());
        System.out.println("Employe name is "+emp.getEmpname());
	}

	// 2.getter & setter method-- use to get & set data of fields
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpage() {
		return empage;
	}

	public void setEmpage(int empage) {
		this.empage = empage;
	}

}
