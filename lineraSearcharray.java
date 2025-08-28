public class lineraSearcharray {
  public static void main(String[] args) {
    int [] nums = {23,45,1,2,3,56,7,8,-11,28 };
    int target = 1;
    int ans = lineraSearch(nums ,target);
    System.out.println(ans);
      
  }
    //search the array
    static int  lineraSearch(int[] arr , int target ){
      if (arr.length == 0){
        return -1;
      }

      // run a for loop
      for (int index = 0; index < arr.length; index++) {
        // check for element at every index if it is = target
        int element = arr[index];
        if (element == target) {
          return index;
        }
      }

      // this line will execute if none of the return statements above have executed
      // hence the target not found
      return -1;
    }
  
}
