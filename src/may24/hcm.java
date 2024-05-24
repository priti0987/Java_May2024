package may24;

import java.util.Scanner;

public class hcm {

	public static void main(String[] args) {


		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number 1 :");
		int num1 = s.nextInt();
		System.out.println("Enter number 2 :");
		int num2 = s.nextInt();
		
		
		System.out.println("hcm of given number is " + hcmmy(num1, num2));
		
	}
	 static int hcmmy(int x,int y) {
		int smaller ;
		int hcm_1=0;
		if (x>y) 
		{
			 smaller = y;
		}
		else
		{
			smaller =x;
				
		}
		for (int i=1;i<=smaller;i++)
		{
			if ((x%i ==0) && (y%i == 0))
			{
			
				hcm_1=i;
			}
		}
		
		
		return hcm_1;
		
	}
}
