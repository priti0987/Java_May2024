package Java_Package;

public class swapWITHOUTTEMP {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println("A and B Before " +a +" "+b);
		
		a =a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("A and B After " +a+" " +b);
				
	}

}
