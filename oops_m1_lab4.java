/*4)Implement a java program to print all tokens of a string on the bases of multiple
separators (use StringTokenizer class)

code:*/

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountTokens 
{
	public static void main(String[] args) 
	{
		String S;
		Scanner scan = new Scanner (System.in);

		System.out.print("Enter the string : ");

		S = scan.nextLine();
		StringTokenizer st = new StringTokenizer(S, " ");
		while(st.hasMoreTokens())
		{
			System.out.println("Remaining are : " + st.countTokens());
			System.out.println(st.nextToken());
		}
	}
}
