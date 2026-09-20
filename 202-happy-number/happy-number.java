class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet();
        while(n>1){
            int sum=0;
            while(n>0){
                sum+=(n%10)*(n%10);
                n/=10;
            }
            n=sum;
            if(!hs.add(n)){
                return false;
            }
        }
        return true;   
        }
    }