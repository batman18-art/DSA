class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int N=nums.length;
        LinkedList<Integer> ll=new LinkedList<>();
        for(int i=0;i<N;i++){
            hs.add(nums[i]);
        }
         for(int i=1;i<=N;i++){
            if(!hs.contains(i))
            {
                ll.add(i);
            }
        }
        return ll;
    }
}