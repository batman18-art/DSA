class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs=new HashSet<>();
        int n=candyType.length;
        for(int i=0;i<n;i++){
            hs.add(candyType[i]);
        }
        int maxlim=(n/2);
        return Math.min(maxlim,hs.size());
    }
}