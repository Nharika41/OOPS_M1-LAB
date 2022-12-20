/*2)Create a class Rectangle. The class has attributes length and width. It should have
methods that calculate the perimeter and area of the rectangle. It should have read
Attributes method to read length and width from user.
o Hint: Area of rectangle = length * width, Perimeter of rectangle = 
2*(length+width).

CODE:*/

//Rectangle.java//
package AreaPeri;
import java.util.Scanner;

public class Rectangle {
	int length;
	int width;
	public void area() {
		 int area=length*width;
		 System.out.println("Area is:"+area);
	}
	public void perimeter() {
		int perimeter=2*(length+width);
		System.out.println("Perimeter is:"+perimeter);
		
	}
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and width");
		length=sc.nextInt();
		width=sc.nextInt();
		sc.close();
	}
	

}
//test.java//package AreaPeri;

public class test {
	public static void main(String args[]) {
	  Rectangle rec=new Rectangle();
	  rec.input();
	  rec.area();
	  rec.perimeter();
	  
	}

}
