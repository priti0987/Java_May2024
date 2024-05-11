package Java_Package;

public class Reverse {
	public static void main(String[] args) {
		//convert a given string in to reverse string
		
		//using String
		String givenString = "4568hjh";
		String revString ="";
		
		for(int i=0;i<=givenString.length()-1;i++)
		{
			revString =  givenString.charAt(i) +revString;
		}
		
		System.out.println("revString is = "+revString);
		
		
		//using string buffer
		
		
		//using string builder
	}

}
