
package com.emp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Employee {

	@Value("${emp.id}")
	private int empId;
	@Value("${emp.name}")
	private String empName;
	@Value("${emp.salary}")
	private double salary;
	@Value("${emp.bu}")
	private String businessUnit;
	@Value("${emp.age}")
	private int age;

	public Employee() {

	}

	public Employee(int employeeId, String employeeName, double employeeSalary, String employeeBU, int employeeAge) {
		this.empId = employeeId;
		this.empName = employeeName;
		this.salary = employeeSalary;
		this.businessUnit = employeeBU;
		this.age = employeeAge;

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
