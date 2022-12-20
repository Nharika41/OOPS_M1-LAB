/*5)Using inheritance, one class can acquire the properties of others. Consider 
a class Animal that has only one method “walk”. Next, create a Bird class that also has 
a fly method. Finally, create a bird object that can both fly and walk.

code:*/

package inheritence;

class anime {
	void walk() {
		System.out.println("Walking");
	}

}

class bird extends anime {
	void fly() {
		System.out.println("flying");
	}
}

public class animal {
	public static void main(String args[]) {
		bird b = new bird();
		b.walk();
		b.fly();
	}
}
