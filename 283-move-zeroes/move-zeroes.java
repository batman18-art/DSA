class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int countZeros=0;
        int k=0;
        for(int i=0;i<n;i++){
              if(nums[i]!=0){
                ans[k++]=nums[i];
                countZeros++;
              }
        }
        for(int i=countZeros;i<n;i++){
            ans[k++]=0;
        }
        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
    }
}