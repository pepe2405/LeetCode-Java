import java.util.Arrays;

class Solution {
    public static void merge(int[] nums1, int n, int[] nums2, int m) {
        for (int i = 0, j = n; i < m; i++) {
            nums1[j] = nums2[i];
            j++;
        }
        Arrays.sort(nums1);
    }
    public static void main(String... args) {
        int[] first = new int[] {1,2,3,0,0,0};
        int[] second = new int[] {2,5,6};
        merge(first, 3, second, 3);
        System.out.println(first);
    }
}