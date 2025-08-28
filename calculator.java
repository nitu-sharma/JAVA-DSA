 import java.util.Scanner;
   public class calculator {
       public static void main(String[] args) {
            System.out.println("Enter an operator (+, -, *, /, %):");
           Scanner in = new Scanner(System.in);
           while (true) {
               char op = in.next().trim().charAt(0);
                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                    System.out.println("Enter two numbers:");
                   int num1 = in.nextInt();

                   int num2 = in.nextInt();
                   int ans = 0;
                   if (op == '+') {
                       ans = num1 + num2;
                   } else if (op == '-') {
                       ans = num1 - num2;
                   } else if (op == '*') {
                       ans = num1 * num2;
                   } else if (op == '/') {
                       ans = num1 / num2;
                       break;
                   } else if (op == '%') {
                       ans = num1 % num2;
                   }
                   System.out.println("Result: " + ans);
               }
           }
       }
      }
