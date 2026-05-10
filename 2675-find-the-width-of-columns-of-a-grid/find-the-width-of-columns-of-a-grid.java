class Solution {
    public int[] findColumnWidth(int[][] arr) {

        ArrayList<Integer> a = new ArrayList<>();

        for(int i = 0; i < arr[0].length; i++){

            int max = 0;

            for(int j = 0; j < arr.length; j++){

                String s = Integer.toString(arr[j][i]);

                if(s.length() > max){
                    max = s.length();
                }
            }

            a.add(max);
        }

        int[] res = new int[a.size()];

        for(int i = 0; i < a.size(); i++){
            res[i] = a.get(i);
        }

        return res;
    }
}