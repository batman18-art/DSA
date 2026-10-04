class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x>=0 && x<=9) return true;
        LinkedList<Integer> ll = new LinkedList<>();
        int count=0;
        while(x>0){
            int val=x%10;
            ll.add(val);
            x=x/10;
        }
        int[] ans=new int[ll.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=ll.remove();
        }
        int k=0;
        int j=ans.length-1;
        while(k<j){
             if(ans[k++]!=ans[j--]) {
                return false;
             }
        }
       return true; 
        
    } 
}