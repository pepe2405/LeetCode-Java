import java.util.Arrays;

class Solution {
//    public boolean isAnagram(String lhs, String rhs) {
//        Map<Character, Integer> first = new HashMap<>();
//        Map<Character, Integer> second = new HashMap<>();
//
//        if (lhs.length() != rhs.length()) {
//            return false;
//        }
//
//        for (var el : lhs.toCharArray()) {
//            if (!first.containsKey(el)) {
//                first.put(el, 0);
//            }
//            first.put(el, first.get(el) + 1);
//        }
//
//        for (var el : rhs.toCharArray()) {
//            if (!second.containsKey(el)) {
//                second.put(el, 0);
//            }
//            second.put(el, second.get(el) + 1);
//            if (!first.containsKey(el) || first.get(el) < second.get(el)) {
//                return false;
//            }
//        }
//
//        return true;
//    }

    public boolean isAnagram(String lhs, String rhs) {
        char[] first = lhs.toCharArray();
        char[] second = rhs.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }

}