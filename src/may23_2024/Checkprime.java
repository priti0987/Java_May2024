package may23_2024;

public class Checkprime {
	public static void main(String[] args) {
		int number =5;

		Boolean flg =false;
		if (number<0)
		{
			System.out.println("Given number is not a prime number");
		}
		else if (number == 1)
		{
			System.out.println("Given number is not a prime number");
			
		}
		else if (number>1)
		{
			for (int i =2 ; i<number;i++)
			{
				if(number%i == 0)
				{
					flg = true;
				}
				
			}
		}
		if(flg) {
		System.out.println("Given number is NOT prime number");
	}
		else
			{
			System.out.println("Given number is prime number");
			}}

}
