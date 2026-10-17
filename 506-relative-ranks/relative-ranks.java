class Solution {
    int maxI(int[] arr,int n){
        int max=Integer.MIN_VALUE;
        int maxIndex=-1;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
                maxIndex=i;
            }
        }
        return maxIndex; 
    }
    public String[] findRelativeRanks(int[] score) {
        int count=0;
        int n=score.length;
        String[] ans=new String[n];
        for(int i=0;i<n;i++){
            int idx=maxI(score,n);
            count++;
            if(count==1) ans[idx]="Gold Medal";
            if(count==2) ans[idx]="Silver Medal";
            if(count==3) ans[idx]="Bronze Medal";
            if(count>3){
                ans[idx]=count+"";
            }
            score[idx]=Integer.MIN_VALUE;
        }
        return ans;
    }
}