class Solution {
    public boolean findSubarrays(int[] arr) {
         HashSet<Integer> s = new HashSet<>();
        for(int i = 0 ; i< arr.length-1;i++){
            int sum = arr[i] + arr[i+1];
            if(s.contains(sum)){
                return true;
            }
            s.add(sum);

        }
       return false; 
    }
}