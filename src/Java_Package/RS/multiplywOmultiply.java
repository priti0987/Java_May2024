package Java_Package.RS;

public class multiplywOmultiply {
	public static void main(String[] args) {
		int a = 5;
		int b =10;
		int m = multiply( a, b);
		System.out.println(m);
		int mw = multiplyw( a, b);
		System.out.println(mw);

	}
	public static int multiply(int x, int y)
	{
		
		return x*y;
	}
	public static int multiplyw(int x, int y)
	{
		int mm =0;
		
		for(int i=0; i<x;i++)
		{
			mm=mm+y;
		}
		return mm;
	}

}
