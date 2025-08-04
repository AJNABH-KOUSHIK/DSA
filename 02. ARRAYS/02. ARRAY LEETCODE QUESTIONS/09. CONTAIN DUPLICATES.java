class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) return false;
        Arrays.sort(nums);             // Step 1: Sort the array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;          // Duplicate found!
            }
        }
        return false;                 // No duplicates found
    }
}
