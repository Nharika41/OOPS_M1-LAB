/*9)You are given an interface AdvancedArithmetic which contains a method signature int 
divisor_sum(int n). You need to write a class called MyCalculator which implements 
the interface.divisor_sum function just takes an integer as input and return the sum of 
all its divisors. For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 
12. The value of n will be at most 1000.

code:*/


//cla.java//
import java.util.Scanner;


public class cla{
  int divisorSum (int n)
{
int sum=0;
for(int i=1; i<=n; i++)
{
if(n%i==0)
sum=sum+i;
}
return sum;
}


public static void main (String args[])
{
Scanner in = new Scanner(System.in);
int i, sum, num;
System.out.println("enter a number less than 1000: ");
num =in.nextInt();
cla obj=new cla();
sum=obj.divisorSum (num);
System.out.println("Sum of all the factors is "+sum);
}

}
