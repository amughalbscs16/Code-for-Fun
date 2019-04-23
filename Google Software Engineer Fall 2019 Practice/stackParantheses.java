import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;
public class reverseList{
	public static void main(String[] args)
	{
		Stack<Character> parantheses = new Stack<Character>();
		String parantee = ")()";
		char[] charParantee = parantee.toCharArray();
		for (int i=0;i<charParantee.length;i++)
		{
			if (charParantee[i] == '(')
			{
				stack.push('(');
			}
			if (charParantee[i] == ')')
			{
				if (stack.isEmpty())
				{
					System.out.println("Error improper parantheses");
					break;
				}
				else {
					stack.pop();	
				}
			}
		}

	}

}