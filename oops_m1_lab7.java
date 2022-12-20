/*7)When a subclass inherits from a superclass, it also inherits its methods; however, it can 
also override the superclass methods (as well as declare and implement new ones). 
Consider the Sports class having methods getName()[which returns name of sport] and 
getNumberOfTeamMembers()[which returns noof team members] create a Soccer class 
that inherits from the Sports class. We can override the getName method and return a 
different subclass-specific string and override getNumberOfTeamMembers method and 
return noof team members

code:*/

//Main.java//

package sports;

public class Main {
	public static void main(String args[]) {
		sports s1=new sports();
		System.out.println(s1.getName());
		System.out.println(s1.getNumberofplayers());
		Soccer s2=new Soccer();
		System.out.println(s2.getName());
		System.out.println(s2.getNumberofplayers());
	}

}
//Soccer.java//
package sports;

public class Soccer extends sports {
	public String getName() {
		return "Soccer";
		
	}
    public int getNumberofplayers() {
    	return 11;
    }

}
//sports.java//
package sports;

public class sports {
	public String getName() {
		return "Game";
		
	}
    public int getNumberofplayers() {
    	return 0;
    }

}
