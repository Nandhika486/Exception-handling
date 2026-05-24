import java.util.*;
/*Write a Java program that:

Create a banking application where:

user withdraws money
if balance is insufficient → throw custom exception
use:
custom exception
throw
throws
try-catch
finally */
public class Main {
  public double deposit(double balance,double amt) throws InputMismatchException
  {
   double x=balance+amt;
    return x;
  }
  public double withdraw(double bal,double amt)throws Exception{
    if(bal<amt){
      throw new Exception("Insufficient balance");

    }
    else{
      double y=bal-amt;
      return y;
    }
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double balance = sc.nextDouble();
    Main m= new Main();
    double x=m.deposit(balance,3000);
    System.out.println("After depositing the total is :"+x);
    try{
    double y=m.withdraw(x,4000);
    System.out.println("The amount is "+y);
    }
    catch(Exception e){
      System.out.println(e.getMessage());
    }
    sc.close();

  }
}
