import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int hIndex(int[] citations) {
        Map<Integer, Integer> map = new HashMap<>();

        int maxCit = Arrays.stream(citations).max().getAsInt();

        for (int i = 0; i <= maxCit; i++) {
            map.put(i, 0);
        }

        for (int citation : citations) {
            for (int i = 0; i <= Math.min(citation, maxCit); i++) {
                map.put(i, map.get(i) + 1);
            }
        }

        int max = 0;
        for (int i = 0; i <= maxCit; i++) {
            if (i <= map.get(i)) {
                max = i;
            }
        }

        return max;

    }

    public static void main(String... args) {
        int[] arr = new int[] { 100 };
        System.out.println(hIndex(arr));
    }
}