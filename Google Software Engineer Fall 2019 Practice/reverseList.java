import java.util.ArrayList;
import java.util.Collections;
public class reverseList{
	public static void main(String[] args)
	{
		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		ArrayList<Integer> revNumbers = new ArrayList<Integer>();
		Numbers.add(1);
		Numbers.add(2);
		Numbers.add(3);
		for (int i=Numbers.size()-1;i>-1;i--)
		{
			revNumbers.add(Numbers.get(i));
		}
		System.out.println(Numbers);	
		System.out.println(revNumbers);
	}

}