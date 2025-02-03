package com.wipro.java.oops;

/**
 * Parent Class = Employee
 * child class = Manager
 * extends is a keyword for inheritance
 */
public class Manager extends Employee{

	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public static void main (String a[]) {
		//Manager manager = new Manager();
		//Manager manager1 = (Manager) new Employee();
		Employee employee = new Manager();
		employee.setEmpId(2548);
		employee.setSalary(60000);
		employee.setEmployeeName("John");
		employee.setEmployeeCompany("Wipro");
		employee.setTaxApplicable(true);
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getEmployeeCompany());
		System.out.println(employee.getSalary());
		System.out.println(employee.isTaxApplicable());
	}

}
