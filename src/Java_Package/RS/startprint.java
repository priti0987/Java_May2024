package Java_Package.RS;

public class startprint {

	public static void main(String[] args) {
	
//		for(int i=0;i<5;i++) {
//			for (int j=0 ; j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//
//		}

		
		
//		String myString ="priti";
//		String revS = "";
//		System.out.println(myString.length()-1);
//		for (int i=myString.length()-1;i>=0;i--)
//		{
//			System.out.println(i);
//			revS = revS +myString.charAt(i);
//			System.out.println(revS);
//			
//		}
//		System.out.println(revS);

	
	
	
//	String f = "asdfgh";
//	String revS = "";
//	for (int i =0;i<=f.length()-1;i++)
//	{
//		revS = f.charAt(i) + revS;
//	}
//	System.out.println(revS);
//	
		
//	int myNumber = 2121123;
//	
//	int revnumber =0;
//	int rem =0;
//	
//	while (myNumber>0)
//	{
//		//System.out.println(myNumber);
//		rem = myNumber%10;
//		revnumber = revnumber *10 +rem ;
//		myNumber = myNumber/10;
//	
//	}
//	System.out.println(revnumber);
//	}
		int number = 456789;
		revrec(number);
		
	}
		
		public static void revrec(int numb)
		{
		if (numb<10)
		{
			System.out.print(numb);
		}
		else
		{
			System.out.print(numb%10);
			revrec(numb/10);
		}
		
	}
}
