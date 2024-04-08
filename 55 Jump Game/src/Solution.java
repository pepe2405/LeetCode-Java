class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (max < i) {
                return false;
            }

            max = Math.max(max, nums[i] + i);

            if (max > size) {
                return true;
            }
        }

        return true;
    }
}