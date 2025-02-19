package com.wipro.java.interface1;

import java.util.Comparator;

public class EmployeeIDComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return Integer.compare(e1.getId(), e2.getId()); // Sort in ascending order of ID
	}
}
