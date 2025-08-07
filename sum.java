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
