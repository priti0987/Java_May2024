package Java_Package.RS;

public class sumofarrayele {

	public static void main(String[] args) {
		
		int [] a = {1,2,30,5};
		int sum = sumArr(a);
		System.out.println(sum);
	}
	
	public static int sumArr(int[] a)
	{
		int sum=0;
		for (int i =0;i<a.length;i++)
			{
			sum = sum+a[i];
			}
		return sum;
	}
}
