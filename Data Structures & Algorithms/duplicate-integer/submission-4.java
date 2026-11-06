class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> test = new HashSet<>();
        for (int num: nums) {
            if(!test.add(num)) {
                return true;
            }
        }
        return false;
    }
}