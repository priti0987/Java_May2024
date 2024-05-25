package may24;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		System.out.println("Enter number 1 :");
		int num1 = s.nextInt();
		System.out.println("Enter number 2 :");
		int num2 = s.nextInt();
		
		
		System.out.println("lcm of given number is " + lcmmy(num1, num2));
		
	}
	 static int lcmmy(int x,int y) {
		 Boolean t= true;
			
		 int higher ;
		int lcm_1=0;
		if (x>y) 
		{
			higher = x;
		}
		else
		{
			higher =y;
				
		}
		while(t) {
			if ((higher%x==0) && (higher%y==0))
			{
				lcm_1 = higher;
				break;
				
			}
			higher +=1;
			
		}
		
		return lcm_1;
		
	}
}
