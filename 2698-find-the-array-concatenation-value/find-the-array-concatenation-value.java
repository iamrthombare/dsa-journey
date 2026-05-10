class Solution {
    public long findTheArrayConcVal(int[] arr) {

        long sum = 0;

        int i = 0;
        int j = arr.length - 1;

        while(i <= j){

            if(i == j){
                sum += arr[i];
            }
            else{
                sum += Long.parseLong("" + arr[i] + arr[j]);
            }

            i++;
            j--;
        }

        return sum;
    }
}