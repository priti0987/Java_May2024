package may24;

import java.util.Scanner;


public class armstrongNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number 1 :");
		int num1 = s.nextInt();
		int l = String.valueOf(num1).length();
//		System.out.println("length " +String.valueOf(num1).length());
		int sumop = 0;
		int temp = num1 ;
		int digit = 0;
		while(temp>0) {
			digit =temp%10;
			sumop = (int)Math.pow(digit,l);
			temp=temp/10;
			}
		if(sumop == num1)
		{
			System.out.println("given number is armstrong ");
		}
		else
		{
			System.out.println("Given number is not armstrong");
		}
		
		
	}

}
