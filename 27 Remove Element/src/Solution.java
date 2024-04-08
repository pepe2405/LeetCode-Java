import java.util.Arrays;

class Solution {
    public static  int removeElement(int[] nums, int val) {
        int count = 0;
        int size = nums.length;

        Arrays.sort(nums);
        for (int i = 0; i < size; i++) {

            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[size - 1];
                nums[size - 1] = temp;
                size--;
            }
        }

        for (int i = 0; i < size; i++) {
            if (nums[i] != val) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }

    public static void main(String... args) {
        int[] arr = new int[] {0,1,2,2,3,0,4,2};

        System.out.println(removeElement(arr, 2));
    }
}