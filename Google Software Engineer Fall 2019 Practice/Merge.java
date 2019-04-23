
public class Merge {
 private static void merge(String[] a, String[] aux, int lo,
		 int mid, int hi) {
	 int i = lo, j = mid;
	 for (int k=lo;k<hi;k++)
	 {
		 if (i==mid)
		 {
			 aux[k] = a[j++];
		 }
		 else if (j == hi)
		 {
			 aux[k] = a[i++];
		 }
		 else if (a[j].compareTo(a[i]) < 0)
		 {
			 aux[k] = a[j++];
		 }
		 else {
			 aux[k] = a[i++];
		 }
	 }
	 //copy back
	 for (int k=lo; k<hi; k++)
		 a[k] = aux[k];
	 
	 System.out.println("M("+lo+","+hi+") :");
	 for (int k=lo;k<hi;k++)
	 {
		 System.out.println(a[k] + " ");
	 }
	 System.out.println();
 }
 public static void sort(String[] a, String[] aux, int lo, int hi)
 {
	if (hi - lo <= 1)
		return;
	int mid = lo + (hi-lo)/2;
	sort(a,aux,lo,mid);
	sort(a,aux,mid,hi);
	merge(a,aux,lo,mid,hi);
 }
 public static void main(String[] args)
 {
	 String[] data = {"it", "was", "the", "best", "of", "times"};
	 String[] work = new String[data.length];
	 Merge.sort(data, work, 0, data.length);
 }
 
}
