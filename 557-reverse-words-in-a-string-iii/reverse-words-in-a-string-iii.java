class Solution {
    public String reverseWords(String s) {
          
          String[] words = s.trim().split("\\s+");
            
            String res = "";
            
            for( String str : words){
                StringBuilder sb = new StringBuilder(str);

            String rev = sb.reverse().toString();
            res+=rev+ " ";
            }
            return res.trim();
    }
}