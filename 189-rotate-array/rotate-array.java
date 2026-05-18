class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
       int t [] = new int[arr.length];
       for(int i = 0 ; i<n;i++){
         t[(i + k) % n] = arr[i];
       } 
       for(int i = 0 ; i<n;i++){
        arr[i]=t[i];
       }
    }
}