class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hash1 = new HashMap<>();
        HashMap<Character, Integer> hash2 = new HashMap<>();
        if (s == null || t == null) {
            return false;
        }
        if(s.length() != t.length()) {
            return false;
        }
        // Iterate s string and add to HashMap
        for(int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            if (hash1.containsKey(charS)) {
                hash1.replace(charS, hash1.get(charS) + 1);
            } else {
                hash1.put(charS, 1);
            }
        }

        // Iterate t string and add to HashMap
        for(int i = 0; i < t.length(); i++) {
            char charT = t.charAt(i);
            if (hash2.containsKey(charT)) {
                hash2.replace(charT, hash2.get(charT) + 1);
            } else {
                hash2.put(charT, 1);
            }
        }

        return hash1.equals(hash2);
    }
}