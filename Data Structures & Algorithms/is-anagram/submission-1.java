class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> test1 = new HashMap<>();
        HashMap<Character, Integer> test2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            test1.put(s.charAt(i), test1.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0; i < t.length(); i++) {
            test2.put(t.charAt(i), test2.getOrDefault(t.charAt(i), 0) +1);
        }
        if(test1.equals(test2)) {
            return true;
        }
        return false;
    }
}
