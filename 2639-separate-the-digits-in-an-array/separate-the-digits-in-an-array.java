class Solution {
    public int[] separateDigits(int[] arr) {
        ArrayList<Integer> a = new ArrayList();

        for(int i =0 ; i<arr.length;i++){
            String str = Integer.toString(arr[i]);
            for(int j = 0 ; j<str.length();j++ ){
                char c = str.charAt(j);
                int num = c - '0';
                a.add(num);
            }
        }

        int res [] = new int[a.size()];

        for(int k = 0 ; k<res.length;k++){
            res[k]=a.get(k);

        }
        return res;
        
    }
}