class Solution {
    public boolean containsDuplicate(int[] a) {
       
        Arrays.sort(a);
        boolean falg = false;
        for(int i = 0 ,j = i+1;i<a.length-1;i++,j++){
            if(a[i]==a[j]){
              falg = true;
              break;
            }
        }
        return falg;
}
}