import java.util.HashMap;
import java.util.Map;

class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        int[] copy = new int[nums.length];
//        copy = Arrays.copyOf(nums, nums.length);
//        Arrays.sort(nums);
//        int l = 0;
//        int r = nums.length - 1;
//        while (nums[l] + nums[r] != target) {
//            if (nums[l] + nums[r] < target) {
//                l++;
//            } else if (nums[r] + nums[r] > target) {
//                r--;
//            } else {
//                break;
//            }
//        }
//
//        int[] arr = new int[2];
//
//        for (int i = 0; i < copy.length; i++) {
//
//            if (copy[i] == nums[l]) {
//                arr[0] = i;
//                break;
//            }
//        }
//
//        for (int i = copy.length - 1; i > 0; i--) {
//            if (copy[i] == nums[r]) {
//                arr[1] = i;
//                break;
//            }
//        }
//
//        return arr;
//    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i) {
                return new int[] { i, map.get(diff) };
            }

        }

        return new int [] {};
    }
}