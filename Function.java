
import java.util.Scanner;

public class Function{
  public static void main(String[] args) {
    int ans= sum2();
    System.out.println(ans);
    sum();
  }
  static int sum2(){
    
   Scanner in = new Scanner (System.in);
   System.out.println("Enter number 1:");
   int num1 = in.nextInt();
   System.out.println("Enter the number 2:");
  int num2 = in.nextInt();
  int sum = num1+num2;
  System.out.println("sum= "+sum );
   return sum;
  }
  static void sum(){
   Scanner in = new Scanner (System.in);
   System.out.println("Enter number 1:");
   int num1 = in.nextInt();
   System.out.println("Enter the number 2:");
  int num2 = in.nextInt();
  int sum = num1+num2;
  System.out.println("sum= "+sum );
  }

}