/*12)Create a class called Customer with data members account_number, balance (initialize 
with 10000), and member functions print(), deposit(), and withdraw(). Print method 
display account number and balance. If withdraw amount is less than current balance 
while withdrawing, throw an exception “In Sufficient Funds”. If the input is 1 do print. 
If the input is 2 withdraw (). If the input is 3 deposit. If the input is 4 terminate program.

code:*/

//BankAccount.java//


public class BankAccount {
 public int ac,num;
 public String name;
 public int total=1000;
 public BankAccount(int a,String b,int c){
 ac=a;
 name=b;
 num=c;
 }
 public int deposite(){
 total=total+num;
 return total;
 }
 public int withdraw(){
 total=total-num;
 return total;
 }
 public void display(){
 System.out.println("Account number : "+ac+"\n");
 System.out.println("Account Holder name:"+name+"\n");
 System.out.println("Initial Amount: "+num+"\n");
 }
}
 
//mainn.java//


public class mainn {
 public static void main(String args[])
 {
 int a=3;
 BankAccount bac=new BankAccount(1,"Deepak",100);
 bac.display();
 System.out.println("Amount after deposition:\t"+bac.deposite()+"\n");
 System.out.println("Amount after withdraw:\t"+bac.withdraw()+"\n");
 }

}
