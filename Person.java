public class Person {
        String name;
        int age;
        int salary;
        public void displayPersonDetails(){
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Salary:"+salary);
        }
         public static void main(String[] args) {
             Person person =new Person();
             person.name="Nitu Sharma";
             person.age=20;
             person.salary= 35000;
             person.displayPersonDetails();
    
         }
    }

