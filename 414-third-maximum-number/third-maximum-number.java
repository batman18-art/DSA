class Solution {
    public int maxNum(int[] arr,int n){
        int max=Integer.MIN_VALUE;
        int maxIndex=-1;
        for(int i=0;i<n;i++){
            if(max<=arr[i]){
                max=arr[i];
                maxIndex=i;
            }
        }
        return maxIndex;
    }
    public int thirdMax(int[] nums) {
        int n=nums.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        int k=0;
        for(var hsel:hs){
            nums[k++]=hsel;
        }
        for(int i=0;i<hs.size();i++){
            int getIndex=maxNum(nums,hs.size());
            if(getIndex<0) break;
            if(hs.size()<3) return nums[getIndex];
           if(i==2){
            return nums[getIndex];
           }
           nums[getIndex]=Integer.MIN_VALUE;
        }
        // return nums[getIndex];
        return -1;
    }
}