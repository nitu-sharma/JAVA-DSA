 
 class Employee{
 int id;
 int salary;
  String name;
  public void printDetails(){
    System.out.println("My id is "+id);
    System.out.println(" my salary is " +salary);
    System.out.println("and my name is "+ name);

  }

 }
public class customclass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee nitu =new Employee();
        nitu.id= 45;
        nitu.salary=80;
        nitu.name= "NITU SHARMA";
        
        nitu.printDetails();
        // System.out.println(nitu.id);
        // System.out.println(nitu.name);
    }
    
}
//practice set
