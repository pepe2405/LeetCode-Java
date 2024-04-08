import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
//    public static int removeDuplicates(int[] nums) {
//        Map<Integer, Integer> map =  new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (!map.containsKey(nums[i])) {
//                map.put(nums[i], 1);
//            } else {
//                map.put(nums[i], map.get(nums[i]) + 1);
//            }
//        }
//
//        int count = 0;
//
//        for (var el : map.entrySet()) {
//            nums[count] = el.getKey();
//            count++;
//
//            if (el.getValue() > 1) {
//                nums[count] = el.getKey();
//                count++;
//            }
//        }
//
//        Arrays.sort(nums, 0, count);
//
//        return count;
//    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (var el : nums) {
            if (i < 2 || el > nums[i - 2]) {
                nums[i++] = el;
            }
        }

        return i;
    }

    public static void main(String... args) {
        int[] arr = new int[] {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
}