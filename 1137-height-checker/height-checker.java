class Solution {
    public int heightChecker(int[] arr) {
   int[] arr1 = Arrays.copyOf(arr, arr.length);
  Arrays.sort(arr1);
  int count = 0 ; 
      
     for(int i = 0;i<arr.length ; i++){
        if(arr[i]!=arr1[i]) count++;

     }

      return count;   
    }
}