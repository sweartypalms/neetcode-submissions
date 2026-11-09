class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> test1 = new HashMap<>();
        int[] solution = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (test1.containsKey(complement)) {
                solution[0] = test1.get(complement);
                solution[1] = i;
            } else {
                test1.put(nums[i], i);
            }
        }
        return solution;
    }
}
