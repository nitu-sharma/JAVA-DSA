<<<<<<< HEAD
class sum {
    
    public static void main (String[]args){
      System.out.println("the sum of these numbers is");
    
       int num1 = 2;
       int num2 = 5;
       int num3 = 8;
       int sum = num1 + num2 + num3;
    
     System.out.print(sum);
}
}
=======
import java.util.Scanner;
public class sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("Enter the first number: " + num1);
        int num2 = input.nextInt();
        System.out.println("Enter the second number: " + num2);

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

    }
    
}
>>>>>>> d04eadc3f741ba088ff95b11a45ea5ed28c6d9c1
