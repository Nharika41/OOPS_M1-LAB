/*3)Implement a Java Program that reads a line of integers, and then displays each integer, 
and the sum of all the integers (use StringTokenizer class)

code:*/

package stingtokenizer;
import java.util.Scanner;
import java.util.StringTokenizer;
public class stringtoken {

	public static void main(String args[]) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		StringTokenizer st=new StringTokenizer(a," ");
		while(st.hasMoreElements()) {
		    String b=st.nextToken();
		    int n=Integer.parseInt(b);
		    System.out.println(n);
		    sum=sum+n;
		    
		}
		System.out.println("Sum of given Integer string:" +sum);
		    
	}
}

