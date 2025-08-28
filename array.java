public class array {
    public static void main(String[] args) {
        //Classroom of 500 students-you have to store marks of 500 students
         int [] marks = {98,45,79,99,80};         
         System.out.println(marks[4]);
         System.out.println(marks.length);
         for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
         }
         for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
         }
    }}
    

