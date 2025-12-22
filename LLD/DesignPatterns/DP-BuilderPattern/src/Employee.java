
public class Employee {

	private final int empID;
	private final String empName;
	private final double empSalary;
	private final String empAddress;

	public Employee(Builder builder) {
		this.empID = builder.empID;
		this.empName = builder.empName;
		this.empSalary = builder.empSalary;
		this.empAddress = builder.empAddress;
	}

	public int getEmpID() {
		return empID;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void displayInfo() {
		System.out.println("Employee Info:");
		System.out.println("ID: " + empID);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + empSalary);
		System.out.println("Address: " + empAddress);
	}

	public static class Builder {
		private int empID;
		private String empName;
		private double empSalary;
		private String empAddress;

		public Builder empID(int empID) {
			this.empID = empID;
			return this;
		}

		public Builder empName(String empName) {
			this.empName = empName;
			return this;
		}

		public Builder empSalary(double empSalary) {
			this.empSalary = empSalary;
			return this;
		}

		public Builder empAddress(String empAddress) {
			this.empAddress = empAddress;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}

	}

	
	public static void main(String[] args) {
		Employee emp = new Employee.Builder().empID(10).empSalary(100).empName("Test").build();
		emp.displayInfo();

	}
}
