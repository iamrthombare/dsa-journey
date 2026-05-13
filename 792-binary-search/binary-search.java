class Solution {
    public int search(int[] arr, int t) {

        int l = 0 ;
        int r = arr.length-1;

        while(l<=r){
            int mid = l + (r-l)/2;

            if(arr[mid]==t){
                return mid;
            }else if(arr[mid]<t){
                l= mid+1;
            }else{
                r = mid -1;
            }
        }
       return -1; 
    }
}