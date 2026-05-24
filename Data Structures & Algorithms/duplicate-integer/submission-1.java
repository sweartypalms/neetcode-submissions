class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], i);
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        System.out.println(map);
        return false;
    }
}