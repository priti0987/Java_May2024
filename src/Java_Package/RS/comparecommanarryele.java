package Java_Package.RS;

import java.util.ArrayList;

public class comparecommanarryele {
	public static void main(String[] args) {
		int a[] = {1,2,5,6,3};
		int b[] = {6,2,5,4,3};
		ArrayList<Integer> aL = new ArrayList<>();
		
		for (int i =0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				aL.add(a[i]);
			}
		}
		//System.out.println(aL);
		Object c[]=aL.toArray();
		for (Object ob : c) {
			System.out.println(ob);
			
		}
	}

}
