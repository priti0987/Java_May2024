package Java_Package;

import java.util.Scanner;

public class Qequation {

	public static void main(String[] args) {
		//(a+b)**2
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number a : ");
		System.out.println("Enter a number b : ");
		int a = s.nextInt();
		int b =s.nextInt();
		
		System.out.println("sqaure of sum of given number is  "+(a+b)*(a+b));
		
	}
}
