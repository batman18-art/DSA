class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> hm1 = new HashMap<>();
        for (char c : s.toCharArray()) {
            hm1.put(c, hm1.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!hm1.containsKey(c)) {
                return c;
            }
            int newCount = hm1.get(c) - 1;
            if (newCount == 0) {
                hm1.remove(c);
            } else {
                hm1.put(c, newCount);
            }
        }
        throw new IllegalStateException("no difference found");
    }
}
