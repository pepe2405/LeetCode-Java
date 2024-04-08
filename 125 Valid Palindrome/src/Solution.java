//class Solution {
//    public boolean isPalindrome(String s) {
//        StringBuilder sb = new StringBuilder();
//        char[] arr = s.toCharArray();
//        for (var el : arr) {
//            if (Character.isAlphabetic(el)) {
//                sb.append(Character.toLowerCase(el));
//            } else if (Character.isDigit(el)) {
//                sb.append(el);
//            }
//        }
//
//        int len = sb.length();
//        for (int i = 0; i < len / 2; i++) {
//            if (sb.charAt(i) != sb.charAt(len - i - 1)) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//}

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (var el : nums) {
            set.add(el);
        }

        return set.size() == nums.length;
    }
}