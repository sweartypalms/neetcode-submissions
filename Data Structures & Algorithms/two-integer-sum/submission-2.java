class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash1 = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(hash1.containsKey(difference)) {
                int index2 = hash1.get(difference); 
                result[0] = index2;
                result[1] = i;
                return result;
            }
            else {
                hash1.put(nums[i], i);
            }
        }
        return result;
    }
}
