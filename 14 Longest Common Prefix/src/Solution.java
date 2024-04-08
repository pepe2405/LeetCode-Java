import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
//    public  String longestCommonPrefix(String[] strs) {
//        StringBuilder sb = new StringBuilder();
//        Map<Character, Integer> map = new HashMap<>();
//
//        String firstWord = strs[0];
//        int arrLength = strs.length;
//
//        for (int i = 0; i < firstWord.length(); i++) {
//            Character ch = firstWord.charAt(i);
//            if (!map.containsKey(ch)) {
//                map.put(ch, 0);
//            }
//            map.put(ch, map.get(ch) + 1);
//            int charCount = map.get(ch);
//
//            for (int j = 1; j < arrLength; j++) {
//                if (strs[j].length() <= i) {
//                    break;
//                }
//                Character toAdd = strs[j].charAt(i);
//                if (!map.containsKey(toAdd)) {
//                    break;
//                }
//                map.put(toAdd, map.get(toAdd) + 1);
//            }
//            if (map.get(ch) != charCount + arrLength - 1) {
//                break;
//            } else {
//                sb.append(ch);
//            }
//        }
//
//        return sb.toString();
//    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return sb.toString();
            }
            sb.append(first.charAt(i));
        }

        return sb.toString();
    }
}