class Solution {
    public int maximumValue(String[] arr) {

        int max = 0;

        for(int i = 0; i < arr.length; i++){

            boolean digit = true;

            for(int j = 0; j < arr[i].length(); j++){

                if(!Character.isDigit(arr[i].charAt(j))){
                    digit = false;
                    break;
                }
            }

            if(digit){
                max = Math.max(max, Integer.parseInt(arr[i]));
            }
            else{
                max = Math.max(max, arr[i].length());
            }
        }

        return max;
    }
}