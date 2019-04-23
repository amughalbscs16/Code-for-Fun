import java.util.Random;
public class ternarySearch {
	    public static int terSearch(int arr[], int l, int r, int x)
	    {
	        // l holds the head of the list [0] and r holds the tail of the
	        // list [length - 1]; ex. l.........r

	        if ( l > r )
	        {
	            return -1;
	        }
	        
	        int d1 = l + ((r - l) / 3);
	        int d2 = d1 + ((r - l) / 3);

	        if (arr[d1] == x)
	        {
	            return d1;
	        }
	        else if (arr[d2] == x)
	        {
	            return d2;
	        }
	        else if ( x < arr[d1])
	        {
	            return terSearch(arr, l, d1 - 1, x);
	        }
	        else if ( x > arr[d2])
	        {
	            return terSearch(arr, d2 + 1, r, x);
	        }
	        else
	        {
	            return terSearch(arr, d1, d2, x);
	        }
	        
	    }

	    // tests the TriSearch function with a presorted array
	    public static void main(String[] args)
	    {
	        int[] arr = new int[1000];
	        for (int i=1;i<1001;i++)
	        	arr[i-1] = i;

	        Random generate = new Random();

	        int x = generate.nextInt(1001)-1000; // returns an int from 0...100

	        if (ternarySearch.terSearch(arr, 0, arr.length - 1, x) == -1)
	        {
	            System.out.println(ternarySearch.terSearch(arr, 0, arr.length - 1, x)
	                 + "\n" + x + " is not on the list");
	        }
	        else
	        {
	            System.out.println(x + " is on index "
	                 + ternarySearch.terSearch(arr, 0, arr.length - 1, x));
	        }
	    }
	
}
