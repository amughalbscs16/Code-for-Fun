import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;
public class stackParantheses{
	public static void main(String[] args)
	{
		Stack<Character> parantheses = new Stack<Character>();
		String parantee = "()()";
		char[] charParantee = parantee.toCharArray();
		for (int i=0;i<charParantee.length;i++)
		{
			if (charParantee[i] == '(')
			{
				parantheses.push('(');
			}
			if (charParantee[i] == ')')
			{
				if (parantheses.isEmpty())
				{
					System.out.println("Error improper parantheses");
					break;
				}
				else {
					parantheses.pop();	
				}
			}
		}

	}

}