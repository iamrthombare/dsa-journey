class Solution {
    public String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");

        StringBuilder res = new StringBuilder();

        for (String str : words) {
            res.append(new StringBuilder(str).reverse()).append(" ");
        }

        return res.toString().trim();
    }
}