package Java_Package;

public class reversewithrecursive {
	
	public static void main(String[] args) {
		revR(5980);
		
	}
	public static void revR(int i)
	{
		if (i <10)
		{
			System.out.print(i);
		}
		else
		{
			System.out.print(i%10);
			revR(i/10);
		}
		
	}
}
