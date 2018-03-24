package beans;

public class Employee {
	private long empId;
	private String empName;
	private String empAddress;
	private double empWeeklySalary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(long empId, String empName, String empAddress, double empWeeklySalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empWeeklySalary = empWeeklySalary;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public double getEmpWeeklySalary() {
		return empWeeklySalary;
	}

	public void setEmpWeeklySalary(double empWeeklySalary) {
		this.empWeeklySalary = empWeeklySalary;
	}

}
