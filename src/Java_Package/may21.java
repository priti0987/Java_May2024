package Java_Package;

import java.util.Scanner;

public class may21 {
	public static void main(String[] args) {
		
		//print ln 
		
		System.out.println("Priti");
	
		//print
		System.out.print("Priti Fuse");
		System.out.print("Tiya Fuse");
		System.out.println("");

		//Addition and Division 
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a =s.nextInt();
		System.out.println("Enter second number: ");
		int b =s.nextInt();

		System.out.println("Addition of given numbers is ="+(a+b));
		System.out.println("Division of given numbers is ="+(a/b));
		
		
		//area of triangle
		int base = 10;
		int height =15;
		System.out.println("Area of triangle is "+ (base*height));
		
		
		//kilometers to miles
		
		System.out.println("Enter kilometers: ");
		int k =s.nextInt();
		double con = 0.621371;
		System.out.println(k+" kilometers is equal to "+k*con+"miles");
		
		//swap
		
		int x=10;
		int y=56;
		int temp;
		
		temp = x;
		x=y;
		y= temp;
		System.out.println("value os x any y is " +x+" "+y);
		
		//random number
	}
}
