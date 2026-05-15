class Solution {
    public int pivotIndex(int[] arr) {

        int n = arr.length;
        int i = 0;

        int left = 0;
        int right = 0;

    
        int k = 0;
        while(k < n){
            right += arr[k];
            k++;
        }

        
        while(i < n){
            
            
            right -= arr[i];

            if(left == right){
                return i;
            }

        
            left += arr[i];
            i++;
        }

        return -1;
    }
}