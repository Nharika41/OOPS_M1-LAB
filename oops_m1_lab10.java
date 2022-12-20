/*10)Implement a Java program for the following
 Creation of simple package.
 Accessing a package.

code:*/
//creating of simple package//

package pckcr;

public class tests {

             public void print() {

             System.out.println("creation of package is done");

             }

}
//Accessing a package//
package pckcraccess;

 

import pckcr.tests;

 

public class test {

          public static void main(String[]args) {

                tests t=new tests();

                t.print();

                

          }

}
