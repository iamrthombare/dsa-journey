class Solution {
    public int majorityElement(int[] arr) {
         int n = arr.length;
         int maj = 0 ;
         int max=0;
         for(int i = 0 ; i<n;i++){
            int count = 0;
            for(int j = i ; j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
               
            }
             if(count > n/2 && count >max) {
                    maj=arr[i];
                }
           
         }
          return maj;
    }
}