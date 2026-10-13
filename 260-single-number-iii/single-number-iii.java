class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!hs.add(nums[i])){
                hs.remove(nums[i]);
            }
        }
        int[] ans=new int[hs.size()];
        int k=0;
        for(var el : hs){
         ans[k++]=el;
        }
        return ans;
    }
}