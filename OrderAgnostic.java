
public class OrderAgnostic {
  public static void main(String[] args) {
      int[] arr ={  -18 ,-12, -4 ,0,1,2,3,4,16,18,22,45,89};
      int target = 22;
      int ans = OrderAgnostic(arr, target);
      System.err.println(ans);
    
  }
   static int OrderAgnostic(int [] arr, int target) {

   int start  = 0;
   int end = arr.length-1;
   boolean isAsc = arr[start ]< arr[end];
  
     while (start <= end){
      int mid =  start + (end - start)/2;
     if(arr[mid ]== target ){
      return mid;
     }
      if (isAsc){
        if (target < arr[mid]){
        end = mid -1;

      }
       else {
        start = mid -1;
      }
      }
    

      
      else{
        if (target > arr[mid]){
        end = mid -1;

      }
      else {
        start = mid+1;
       
      }
      return mid;
      
     }
     return -1;
  }
   }
  }

 