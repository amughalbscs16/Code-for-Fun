import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;
public class stackParantheses{
	public static void main(String[] args)
	{
		String[] tests  = {"(This)", "(T()()"};
		stackParantheses.testCase(tests);
	}
	public static void testCase(String[] tests)
	{
		Stack<Character> parantheses;
		Boolean areEqual;
		for (String test: tests)
		{
			areEqual = true;
			System.out.println("For the String: "+test);
			parantheses = new Stack<Character>();
			char[] charParantee = test.toCharArray();
			for (int i=0;i<charParantee.length;i++)
			{
				if (charParantee[i] == '(')
				{
					parantheses.push('(');
				}
				else if (charParantee[i] == ')')
				{
					if (parantheses.isEmpty())
					{
						areEqual=false;
						break;
					}
					else {
						parantheses.pop();	
					}
				}
			}
			if (areEqual && parantheses.isEmpty())
			{
				System.out.println("Are Equal");
			}
			else {
				System.out.println("Error improper parantheses");
			}

		}

	}
}