
    class Employee {
        int salary;
        String name;
        public int getsalary(){
            return salary;
        }
        public String getName(){
            return name;
        }
        public void setName(String n){
            name= n;
        }
    }
    public class practice {
    public static void main(String[] args) {
        //problem 1
      var nitu = new Employee();
      nitu.salary=455;

    //   nitu.setName("Nitu Sharma ");
    System.out.println(nitu.getsalary());
    //   System.out.println(nitu.getName());
    }
}
