class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs=new HashSet<>();
        int n=candyType.length;
        for(int i=0;i<n;i++){
            hs.add(candyType[i]);
        }
        int maxlim=(n/2);
        int count=0;
        int n2=hs.size();
        if(maxlim==n2) return n2;
        for(int i=0;i<n2;i++){
            if(maxlim==0){
              return count;
            }
            hs.remove(candyType[i]);
            count++;
            maxlim--;
        }
        return count;
    }
}