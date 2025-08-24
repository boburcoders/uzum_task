public class TwoPointer {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[i] = nums[j];
                    nums[j] = -1;
                }
            }
        }
        int counter = 0;
        for (int num : nums) {
            if (num != -1) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3,3,4,4,4,4,4,4};
        System.out.println(removeDuplicates(nums));
    }
}
