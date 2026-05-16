class Solution {
    public int findMin(int[]arr) {
    int m = arr[0] ;

    for(int n : arr){
        if(n < m){
            m = n;
        }
    }
      return m;  
    }
}