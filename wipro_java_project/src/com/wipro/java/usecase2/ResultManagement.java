package com.wipro.java.usecase2;

import java.util.ArrayList;
import java.util.List;

public class ResultManagement {

	private List<Student> students = new ArrayList<>();

	public void updateResult(Student student) {
		students.add(student);
	}

	public void showResults() {
		for (Student student : students) {
			student.details();
		}
	}

	public static void main(String[] args) {
		ResultManagement management = new ResultManagement();

		management.updateResult(new Results(1, "Sree", "A", "Data Science"));
		management.updateResult(new Results(2, "John", "C", "Python"));

		management.showResults();
	}

}
