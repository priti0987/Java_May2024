package Java_Package;

public class Reverse {
	public static void main(String[] args) {
		//convert a given string in to reverse string
		
		//using String
		String givenString = "4568hjh";
		String revString ="";
		int number1 = 456;
		int revNumber = 0;
		int rem = 0;
		System.out.println("Reversing a given number ");
		
		while (number1>0)
		{
			rem = number1%10;
			revNumber = revNumber*10+rem;
			number1 /=10;
		}
		
		
		System.out.println("reversed number :: "+revNumber);
		
		
		
		for(int i=0;i<=givenString.length()-1;i++)
		{
	revString =  givenString.charAt(i) +revString;
		}
		
		System.out.println("revString is = "+revString);
		
		
		//using string buffer
		StringBuffer s = new StringBuffer();
		s.append("priti");
		s.reverse();
		System.out.println(s);
		
		
		//using string builder
		StringBuilder sb = new StringBuilder();
		
		sb.append("okokno");
		sb.reverse();
		System.out.println(sb);
	}

}
