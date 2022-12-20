/*8)Implement a java program to create an abstract class named Shape that contains an
empty method named numberOfSides ( ).Provide three classes named Trapezoid,
Triangle and Hexagon such that each one of the classes extends the class Shape. Each
one of the classes contains only the method numberOfSides ( ) that shows the number
of sides in the given geometrical figures.

code:*/

//hexagon.java//

public class hexagon extends shape{
	public int noofsides() {
		return 6;
	}

}
//Main.java//

public class Main {
	public static void main(String args[]) {
		triangle t1=new triangle();
		System.out.println(t1.noofsides());
		trapizoid t2=new trapizoid();
		System.out.println(t2.noofsides());
		hexagon h1=new hexagon();
		System.out.println(h1.noofsides());
		
	}

}
//shape.java//

abstract public class shape {
	 abstract int noofsides();
}

//trapizoid.java//

public class trapizoid extends shape{
	public int noofsides() {
		return 4;
	}

}
//traingle.java//

public class triangle extends shape {
 public int noofsides() {
	 return 3;
 }
}
