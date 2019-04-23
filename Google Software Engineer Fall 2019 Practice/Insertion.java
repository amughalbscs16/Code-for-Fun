
public class Insertion {
	public static void sort(String[] a)
	{
		int n = a.length;
		for (int i=1;i<n;i++)
		{
			for (int j=i;j>0;j--)
			{
				if (a[j-1].compareTo(a[j])>0)
				{
					exch(a,j-1,j);
				}
				else break;
			}
			//print sorted component of array;
			for (int k=0;k<=i;k++)
			{
				System.out.print(a[k]+" ");
			}
			System.out.println();
		}
	}
	private static void exch(String[] a, int i, int j)
	{
		String swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	public static void main(String[] args){
		String[] data = {"it", "was", "the", "best", "of", "times", "it", "was"};
		sort(data);
	}
}
