class Solution {
    public int compress(char[] c) {

        String res = "";

        for (int i = 0; i < c.length; ) {

            int count = 1;
            res +=  String.valueOf(c[i]);

            int j = i + 1;

            while (j < c.length && c[i] == c[j]) {
                count++;
                j++;
            }

            if (count > 1)
                res += String.valueOf(count);

            i = j; 
        }

        for (int i = 0; i < res.length(); i++) {
            c[i] = res.charAt(i);
        }

        return res.length();
    }
}