/*11)Implement a Java program to read two numbers a,b from user and perform division 
a/b,if the user passes b value as zero, handle the exception using try and catch otherwise
display the result.

code:*/
//division.java//

package division;

import java.util.Scanner;

public class division {
	public static void main(String args[]) {
		try {
			int a, b, c;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of a:");
			a = sc.nextInt();
			System.out.println("Enter the value of b:");
			b = sc.nextInt();
			c = a / b;
			System.out.println("The division of a and b (a/b)is:"+c);
		}
		catch (ArithmeticException e) {
			System.out.println("/Zero division Error/" + e);

		}

	}

}
