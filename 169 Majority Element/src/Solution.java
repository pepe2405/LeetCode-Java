import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
//    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (!map.containsKey(nums[i])) {
//                map.put(nums[i], 1);
//            } else {
//                map.put(nums[i], map.get(nums[i]) + 1);
//            }
//        }
//
//        int i = 0;
//        for (var el : map.entrySet()) {
//            if (el.getValue() > nums.length / 2) {
//                i = el.getKey();
//                break;
//            }
//        }
//
//        return i;
//    }
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
}
}