class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashSet<Character> hs=new HashSet<>();
        int count=0;
        int  maxCount=0;
        if(n==1){
            return 1;
        }
        for(int i=0;i<n;i++){
            if(!hs.add(s.charAt(i))){
            //    count=hs.size();
               hs.clear();
               i=Math.abs(count-i);
               count=0;
            }else{
               count++; 
            }
            if( maxCount < count){
                 maxCount=count;
            }
        }
        // if(count==0 && hs.size()!=0){
        //     maxCount=hs.size();
        // }
        return maxCount;
    }
}