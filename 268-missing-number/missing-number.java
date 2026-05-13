class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
                Arrays.sort(arr);
                if(arr[0]!=0) return 0;

        for(int i = 1; i<n;i++){
            if(arr[i]- arr[i-1]>1){
                return arr[i-1]+1;
            }
            
        }
          return n;

       
        
    }
}