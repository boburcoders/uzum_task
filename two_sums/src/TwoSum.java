public class TwoSum {
    public static String two_sums(int[] nums, int target) {
        int left = 0, right = nums.length - 1, sum = 0;
        while (left < right) {
            sum = nums[left] + nums[right];
            if (target == sum) {
                return "%d + %d = %d".formatted(nums[left], nums[right], target);
            }
            if (target > sum) {
                left++;
            }
            if (target < sum) {
                right--;
            }
        }
        return ("There is not sums of numbers for this target: " + target);
    }
    public static void main(String[] args) {
        int[] array = {1,2,5,6,7,8};
        String two_sums = two_sums(array, 11);
        System.out.println(two_sums);
    }
}
