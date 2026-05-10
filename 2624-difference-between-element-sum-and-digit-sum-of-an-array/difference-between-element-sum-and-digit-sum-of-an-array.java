class Solution {
    public int differenceOfSum(int[] arr) {
        int e = 0; 
        int d = 0 ;

        for(int i = 0 ; i< arr.length;i++){
            e+= arr[i];
            while(arr[i]!=0){
                d+= arr[i] % 10;
                arr[i]/=10;
            }
        }
       return Math.abs(e-d); 
    }
}