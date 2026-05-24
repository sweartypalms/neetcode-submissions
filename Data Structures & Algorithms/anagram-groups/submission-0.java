class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
            int[] azArray = new int[26];
            for(char c : s.toCharArray()) {
                azArray[c - 'a']++;
            }
            String key = Arrays.toString(azArray);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
