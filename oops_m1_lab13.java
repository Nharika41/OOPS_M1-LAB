/*13)Implement a Java program which accepts age as input from the user and throws an
exception
o “Not Eligible to Vote” when age is <=18 otherwise print “Eligible to Vote”.

code:*/

package voting;

import java.util.Scanner;

public class vote {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		if (age < 18) {
			throw new ArithmeticException("NOT ELEGIBLE FOR VOTING");
		} else {
			System.out.println("ELEGIBLE FOR VOTING");
		}
	}
}
