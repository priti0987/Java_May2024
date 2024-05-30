package Java_Package.RS;

public class maxdiffadjecntindex {
	public static void main(String[] args) {
		int[] a = {1,4,8,15,17};
		int maxdiff =0;
		for (int i=0;i<a.length-1;i++)
		{
			if ((a[i+1]-a[i])>maxdiff)
				{
					maxdiff = a[i+1]-a[i];
				}
		}
		
		System.out.println(maxdiff);
	}

}
