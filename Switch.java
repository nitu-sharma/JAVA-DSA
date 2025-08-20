import java.util.Scanner;
public class Switch {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter the fruits ");
    String fruit = in.next();
    
     
    switch (fruit){
      case "mango" -> System.out.println("king of fruits");
      case "apple" -> System.out.println("A sweet red fruit");
      

    }

    }
}
