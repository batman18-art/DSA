class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int n=nums.length;
       int countOnes=0;
       int[] ans=new int[n];
       int k=0;
       for(int i=0;i<n;i++){
            if(nums[i]==1){
                countOnes++;
            }else{
                ans[k++]=countOnes;
                countOnes=0;
            }
       }
       if(k<=n-1) ans[k++] = countOnes;
       int max=0;
       for(int i=0;i<n;i++){
        if(max<ans[i]){
            max=ans[i];
        }
       } 
       return max;
    }
}