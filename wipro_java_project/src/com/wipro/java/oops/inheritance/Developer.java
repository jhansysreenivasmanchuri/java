/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 * Parent Class = Employee
 * child class = Developer
 * extends is a keyword for inheritance
 */
public class Developer extends Employee{

	/**
	 * 
	 */
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public static void main (String a[]) {
		Employee employee = new Developer();
		employee.setEmpId(5678);
		employee.setSalary(25000);
		employee.setEmployeeName("Raju");
		employee.setEmployeeCompany("Wipro");
		employee.setTaxApplicable(false);
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getEmployeeCompany());
		System.out.println(employee.getSalary());
		System.out.println(employee.isTaxApplicable());
	}

}
