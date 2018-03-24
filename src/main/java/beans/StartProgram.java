package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		
	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	//ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/beans.xml");	
	
	EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
	
	System.out.println("Before salary update");
	System.out.println("Employee 1 Salary: " +employeeService.getEmployee(1).getEmpWeeklySalary());
	System.out.println("Employee 2 Salary: " +employeeService.getEmployee(2).getEmpWeeklySalary());
	
	employeeService.changeSalary(1, 450);
	employeeService.changeSalary(2, 350);
	
	System.out.println("After salary update");
	System.out.println("Employee 1 Salary: " +employeeService.getEmployee(1).getEmpWeeklySalary());
	System.out.println("Employee 2 Salary: " +employeeService.getEmployee(2).getEmpWeeklySalary());
		
	}

}
