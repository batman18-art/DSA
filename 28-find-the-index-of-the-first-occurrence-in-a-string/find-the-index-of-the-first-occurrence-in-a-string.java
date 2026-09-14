class Solution {
    public int strStr(String haystack, String needle) {
        int fOccurance=-1;
        int n = haystack.length();
        int m = needle.length();
       for(int i=0;i<haystack.length();i++){
           int j=0;
           int k=i;
           int flag=0;
            while(j < m && k < n && haystack.charAt(k)==needle.charAt(j)){    
            j++;
            k++;
            flag++;
            }
        if(flag==needle.length()){
         return i;
    }
       }
       return -1;
    }
}