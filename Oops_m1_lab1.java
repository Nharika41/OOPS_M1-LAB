/*1)There is a telecommunication company called “Powered Air” who have approached 
you to build their Interactive Voice Response (IVR) system. write a Java program and 
be able to provide the following menu (given below):
Note: User should provide an input for each menu display. Welcome to Powered Air 
service. What would you like to do?
a. Know my balance. b. Know my validity date
c. Know number of free calls available. d. More
1) Prepaid Bill Request 2) Customer Preferences
3) GPRS activation 4) Special Message Offers
5) Special GPRS Offers 6) 3G Activation
7) Go back to Previous menu
You are free to display your own messages in this IVR

CODE:*/

package CustomerCare;
import java.util.Scanner;

public class PoweredAir {
	public static void main(String args[]){
		int choice;
        System.out.println("Welcome to Powered Air!");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1-Know my balance");
			System.out.println("2-Know my validity");
			System.out.println("3-Know number of free calls avaiable");
			System.out.println("4-More");
			System.out.println("5-Exit");
			System.out.println("Select your choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Know my balance");
				break;
			case 2:
				System.out.println("Know my validity");
				break;
			case 3:
				System.out.println("Know number of free calls available");
				break;
			case 4:
				while (true) {
					System.out.println("1-Prepaid Bill request");
					System.out.println("2-Customer preference");
					System.out.println("3-GPRS activation");
					System.out.println("4-Special message offers");
					System.out.println("5-Special GPRS offers");
					System.out.println("6-3G Activation");
					int s;
					s = sc.nextInt();
					switch (s) {
					case 1:
						System.out.println("Prepaid Bill request");
						break;
					case 2:
						System.out.println("Customer preference");
						break;
					case 3:
						System.out.println("GPRS Activation");
						break;
					case 4:
						System.out.println("Special Message offers");
						break;
					case 5:
						System.out.println("10-Special GPRS offers");
						break;
					case 6:
						System.out.println("3G Activation");
					break;
					}
					if (s == 8)
						break;

				}
			case 5:
				System.exit(1);

			default:
				System.out.println("Enter valid number");
			}

		}

	}

}
