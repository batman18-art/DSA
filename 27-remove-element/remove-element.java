class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int[] ans=new int[nums.length];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
              nums[i]=0;
              k++;
            }
            else{
                ans[idx++]=nums[i];
            }
        }
        for(int i=0;i<idx;i++){
            nums[i]=ans[i];
        }
        
        return nums.length-k;
    }
}