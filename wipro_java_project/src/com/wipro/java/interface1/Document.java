package com.wipro.java.interface1;

public class Document implements Printable, Showable{


	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show");
	}


	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print");
	}
	public static void main(String a[]) {
		Document doc1 = new Document();
		doc1.show();
		doc1.print();
	}

}
