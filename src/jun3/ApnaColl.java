package jun3;

import java.util.Arrays;

public class ApnaColl {

	public static void main(String[] args)
	{
		//sorting array
		int[] marks = {5,61,22,33,89,1};
		
//	for(i in marks)
		
		for (int i =0;i<marks.length;i++)
		{
			System.out.print(marks[i]+ " ");
		}
		Arrays.sort(marks);
		System.out.println();
		for (int i =0;i<marks.length;i++)
		{
			System.out.print(marks[i]+ " ");
		}
	

	//casting
		
		System.out.println();
		double d = 155.56;
		double fd = 100.00;
		System.out.println(d+fd);
		
		int i = 90;
		int fi = i + (int)10.10;
		System.out.println(fi);
		System.out.println( i + 10.10);
	
	}
}
