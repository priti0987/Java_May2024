package may24;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter fibo series count ");
		int cterms = s.nextInt();
		
		int n1=0;
		int n2=1;
		int nnth =0;
		int count =0;
		
		if (cterms <=0)
				{
			System.out.println("Please enter positive number ");
				}
		else if (cterms==1)
		{
		System.out.println("Fibonacci serious till "+cterms+ ": ");
		System.out.println(cterms);
		}
		else
		{
			System.out.println("Fibonacci sequence : ");
			while (count<cterms)
			{
				System.out.println(n1);
				nnth = n1+n2;
				n1=n2;
				n2 = nnth;
				count+=1;
				
				
			}
		}
	s.close();
	}
}
