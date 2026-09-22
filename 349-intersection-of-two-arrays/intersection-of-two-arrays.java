class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        int k=0;
        for(int i=0;i<nums1.length;i++){
            hs1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            hs2.add(nums2[i]);
        }
        int fsize=0;
        if(hs1.size()>hs2.size()){
            fsize=hs2.size();
        }
        else{
            fsize=hs1.size();
        }
         int count=0;  
         int[] ans=new int[fsize];
        for(var elhs1:hs1){
            if(hs2.contains(elhs1)){
                ans[k++]=elhs1;
                count++;
            }
        }
        int[] result=new int[count];
        int j=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i]!=0){
                result[j++]=ans[i];
            }
        }
       return result;
    }
}