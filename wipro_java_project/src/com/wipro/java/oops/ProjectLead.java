/**
 * 
 */
package com.wipro.java.oops;

/**
 * Parent Class = Employee
 * child class = ProjectLead
 * extends is a keyword for inheritance
 */
public class ProjectLead extends Employee {
	
	/**
	 * 
	 */
	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		//Child Object is instantiated from child constructor
		//Parent class consumes the properties and behaviors of child class
		//ProjectLead projectLead = new ProjectLead();
		//ProjectLead projectLead1 = (ProjectLead) new Employee();
		Employee employee = new ProjectLead();
		employee.setEmpId(1234);
		employee.setSalary(40000);
		employee.setEmployeeName("Sree");
		employee.setEmployeeCompany("Wipro");
		employee.setTaxApplicable(true);
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getEmployeeCompany());
		System.out.println(employee.getSalary());
		System.out.println(employee.isTaxApplicable());
	}
}
