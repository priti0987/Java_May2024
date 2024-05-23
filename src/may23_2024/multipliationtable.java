package may23_2024;

import java.util.Scanner;

public class multipliationtable {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number :");
	int number =s.nextInt();
	System.out.println("Multiplication table for "+number);
	for (int i=1;i<10;i++)
	{
		System.out.println(number+ " X " + " i "+" = "+(number*i) );
		
	}
	
}
}
