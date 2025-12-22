
public class FullTimeEmployeeBuilder implements EmployeeBuilder {

	private final Employee.Builder builder = new Employee.Builder();

	@Override
	public void buildEmpID(int empID) {
		builder.empID(empID);
	}

	@Override
	public void buildEmpName(String empName) {
		builder.empName(empName);
	}

	@Override
	public void buildEmpSalary(double empSalary) {
		builder.empSalary(empSalary);
	}

	@Override
	public void buildEmpAddress(String empAddress) {
		builder.empAddress(empAddress);
	}

}
