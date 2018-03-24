package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDaoInMemoryImpl implements EmployeeDao {
	private Map<Long,Employee>employeesMap = new HashMap<Long,Employee>();
	{
	Employee employee1 = new Employee(1L, "Mike", "303 5th Street", 300);
	Employee employee2 = new Employee(2L, "Shelly", "433 Toe Ave", 275);
	employeesMap.put(employee1.getEmpId(), employee1);
	employeesMap.put(employee2.getEmpId(), employee2);
}

	public void insert(Employee employee) {
		employeesMap.put(employee.getEmpId(), employee);
		
	}

	public void update(Employee employee) {
		employeesMap.put(employee.getEmpId(), employee);
		
	}

	public void update(List<Employee> employees) {
		for(Employee employee:employees) {
			update(employee);
		}
		
	}

	public void delete(long empId) {
		employeesMap.remove(empId);
		
	}

	public Employee find(long empId) {
	
		return employeesMap.get(empId);
	}

	public List<Employee> find(List<Long> empIds) {
		List<Employee>employees = new ArrayList<Employee>();
		for (Long empId: empIds) {
			employees.add(employeesMap.get(empId));
		}
		return employees;
	}

	public List<Employee> find(String empName) {
		List<Employee>employees = new ArrayList<Employee>();
		for(Employee employee: employeesMap.values()) {
			if(empName.equals(employee.getEmpName())) {
				employees.add(employee);
			}
		}
		return employees;
	}
}