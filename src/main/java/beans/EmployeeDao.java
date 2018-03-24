package beans;

import java.util.List;

public interface EmployeeDao {
	public void insert(Employee employee);
	public void update(Employee employee);
	public void update(List<Employee>employees);
	public void delete(long empId);
	public Employee find(long empId);
	public List<Employee>find(List<Long>empIds);
	public List<Employee>find(String empName);
}
