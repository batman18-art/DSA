class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n<0) return false;
        long val=4;
        while(val<=n){
            if(val==n){
                return true;
            }
            else{
                val=val*4;
            }
        }
        return false;
    }
}