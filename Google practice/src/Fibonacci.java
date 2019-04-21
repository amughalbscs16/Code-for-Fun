import java.util.Arrays;
import java.math.BigInteger;
public class Fibonacci {
 public static void main(String args[])
 {
	 BigInteger arr[] = new BigInteger[200+1];
	 Arrays.fill(arr,BigInteger.ZERO);
	 arr[1] = arr[1].valueOf(1);
	 arr[2] = arr[2].valueOf(1);
	 BigInteger ali = Fibonacci.fibonacci(42,arr);
	 System.out.println(ali);
 }
 public static BigInteger fibonacci(int n, BigInteger arr[])
 {
	 if (arr[n].compareTo(BigInteger.ZERO) > 0) // If Value is Positive
	 {
		 return arr[n];
	 }
	 if (n == 1 || n == 2)
	 {
		 return new BigInteger("1");
	 }
		 else 
	 {
		 return fibonacci(n-1,arr).add(fibonacci(n-2,arr));
	 }
 }
}
