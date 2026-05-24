import java.util.InputMismatchException;
import java.util.Scanner;
/*Write a Java program that:


takes two numbers
performs division
accesses array element
handles:
ArithmeticException
ArrayIndexOutOfBoundsException
InputMismatchException
use nested try-catch */
public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    try{
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int[] arr = {23,34,45,56};
    try{
      int result=n1/n2;
      System.out.println(result);
      try{
        System.out.println(arr[0]);
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e.getMessage());
      }
    }
    catch(ArithmeticException e){
      e.printStackTrace();
    }
  }
  catch(InputMismatchException e){
    System.out.println(e.toString());
  }
    finally{
      System.out.println( "The remaining code");
    }
    sc.close();


  }
}


