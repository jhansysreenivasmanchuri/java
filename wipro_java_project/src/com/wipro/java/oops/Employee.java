/**
 * 
 */
package com.wipro.java.oops;
/**
 POJO(Plain Old Java Object) 
 */
public class Employee {
	private int empId;// Employee ID
	private String employeeName;// Employee Name
	private String employeeCompany;// Employee Company
	private int Salary;// Employee Salary
	private boolean isTaxApplicable;
	/**
	 * @return the isTaxApplicable
	 */
	public boolean isTaxApplicable() {
		return isTaxApplicable;
	}

	/**
	 * @param isTaxApplicable the isTaxApplicable to set
	 */
	public void setTaxApplicable(boolean isTaxApplicable) {
		this.isTaxApplicable = isTaxApplicable;
	}
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return the employeeCompany
	 */
	public String getEmployeeCompany() {
		return employeeCompany;
	}

	/**
	 * @param employeeCompany the employeeCompany to set
	 */
	public void setEmployeeCompany(String employeeCompany) {
		this.employeeCompany = employeeCompany;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return Salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeCompany='" + employeeCompany + '\'' +
                ", Salary=" + Salary +
                ", isTaxApplicable=" + isTaxApplicable +
                '}';
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
