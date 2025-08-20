
// import java.util.Arrays;

import java.util.Arrays;

public class SearchIn2Darray {
  
  public static void main(String[] args) {
      int [][] arr ={
        {23,4,1},
        {18,12,3,9},
        {78,98,89,56},
        {18,13}

      };
      int target = 13;
      int [] ans = search(arr,target);
      System.out.println(Arrays.toString(ans));
      // System.out.println(serach(arr, target));
  }
  static  int[] search(int[][] arr, int target){
    for(int row =0; row<arr.length;row++){
      for(int col =0; col<arr[row].length;col++){
        if(arr[row][col] == target){
          return new int[]{row,col}  ;  
           }
      }

    }
    return new int[]{-1,-1};
  }
}
