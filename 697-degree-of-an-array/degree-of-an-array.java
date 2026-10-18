class Solution {
    public int findShortestSubArray(int[] nums) {
        int[] first = new int[50000];
        int[] count = new int[50000];
        java.util.Arrays.fill(first, -1);
        int degree = 0, ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (first[x] == -1) first[x] = i;
            count[x]++;
            int length = i - first[x] + 1;

            if (count[x] > degree) {         
                degree = count[x];
                ans = length;
            } else if (count[x] == degree) {  
                ans = Math.min(ans, length);
            }
        }
        return ans;
    }
}