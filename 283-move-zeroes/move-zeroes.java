class Solution {
    public void moveZeroes(int[] arr) {

          int k = 0 ;
        for(int i = 0 ; i<arr.length; i++){
            
                if(arr[i]!=0){
                    arr[k++]=arr[i];

                }
            
        }
        for(int j = k ;j<arr.length;j++){
            arr[k++]=0;
        }
 
        
    }
}