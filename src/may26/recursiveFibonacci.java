package may26;
import java.util.Scanner;
public class recursiveFibonacci {
	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a number : ");
			int numberF = s.nextInt();
			
			if (numberF <=0)
					{
						System.out.println("Please enter positive number");
					}
			else
			{
				System.out.println("Fibonacci series : ");
				for(int i =0;i<numberF;i++)
				{
					System.out.println(rec_fibo(i));
				}
			}
			s.close();
	
	}
		
		static int rec_fibo(int number)
		{
			if (number<=1)
			{
				return number;
			}
			else
			{
				return rec_fibo(number-1) + rec_fibo(number-2);
			}
		}
	}


