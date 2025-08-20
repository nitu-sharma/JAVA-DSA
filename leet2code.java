public class leet2code {
  public static void main(String[] args) {
    
  }
  
  public int  maximumWealth(int[][] accounts){
    int ans = Integer.MIN_VALUE;
    for(int[] ints: accounts){
      //new col new sum
      int sum =0;
      for(int[] anInt : accounts){
        sum += anInt;

      }
      if(sum> ans){
        ans = sum;
      }
    }
   return ans;
  }
  
}
