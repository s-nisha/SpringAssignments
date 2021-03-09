package com.emp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeMain applet = new EmployeeMain();
		applet.run();
		
	}
	public void run() {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext() ;
		container.register(Config.class);
		container.refresh();
		Employee employee = container.getBean(Employee.class);
		System.out.println("Employee details"
				   +"\n----------------------"
				   +"\nEmployee ID : "+employee.getEmpId()
				   +"\nEmployee Name : "+employee.getEmpName()
				   +"\nEmployee Salary : "+employee.getSalary()
				   +"\nEmployee BU : "+employee.getBusinessUnit()
				   +"\nEmployee Age : "+employee.getAge()
				);
		container.close();
	}

}
