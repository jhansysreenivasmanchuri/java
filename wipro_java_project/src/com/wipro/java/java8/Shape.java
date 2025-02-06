package com.wipro.java.java8;

//1. Single abstract method
//@FunctionalInterface
//default or/and static  


@FunctionalInterface
interface TestInterface
{
  // only 1 abstract method
  public void shape(int a);



  // default method
  default void  square(int a)
  {
    //System.out.println("Default Method Executed");
	  System.out.println("Default Method Executed: Square: "+ a + "," + (a * a));
  }
  
//default method
  default void rectangle(int a, int b)
  {
    //System.out.println("Default Method Executed");
	    System.out.println("Default Method Executed: Rectangle: "+ a +","+ b + "," +(a * b));
  }
  
  //static method
  static void show()
  {
      System.out.println("Static Method Executed");
  }

//static method
  static void show1()
  {
	  System.out.println("Static Method Executed");
  }
}

public class Shape implements TestInterface{

	public void shape(int a)
    {
        System.out.println("Areas with "+a);
    }
	public static void main(String[] args) {
		Shape s = new Shape();
		s.shape(4);
		
		s.square(4);
		s.rectangle(4, 6);
		TestInterface.show();
	}

}
