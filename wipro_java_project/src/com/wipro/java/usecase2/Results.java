package com.wipro.java.usecase2;

public class Results extends Student {

	private String subject;

	public Results(int id, String name, String grade, String subject) {
		super(id, name, grade);
		this.subject = subject;

	}

	@Override
	public void details() {
		System.out.println("Result of " + getId() + " " + getName() + " in " + subject + " is " + getGrade());
	}

}
