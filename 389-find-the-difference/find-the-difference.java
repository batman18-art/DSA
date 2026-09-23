class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> hm1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hm1.containsKey(s.charAt(i))){
                hm1.put(s.charAt(i),1);
            }
            else{
                hm1.put(s.charAt(i),hm1.get(s.charAt(i))+1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(!hm1.containsKey(t.charAt(i))){
                return t.charAt(i);
            }else{
                if(hm1.get(t.charAt(i))==1){
                    hm1.remove(t.charAt(i));
                }
                else{
                    hm1.put(t.charAt(i),hm1.get(t.charAt(i))-1);
                }
            }
        }
        return t.charAt(t.length()-1);
    }
}