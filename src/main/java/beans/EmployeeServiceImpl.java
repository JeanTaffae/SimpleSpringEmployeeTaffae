package beans;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
		
	public EmployeeServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void changeSalary(long employeeId, double amount) {
		Employee employee = employeeDao.find(employeeId);
		employee.setEmpWeeklySalary(amount);
		employeeDao.update(employee);
	}

	public Employee getEmployee(long employeeId) {
		return employeeDao.find(employeeId);
	}
	
}
