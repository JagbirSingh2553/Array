package Day4;

public class Subarray_max_sum {
    public int maxSubArray(int[] nums, int k) {
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        max_sum = Math.max(max_sum, sum);
        for(int i = k; i < nums.length; i++){
            sum = sum - nums[i - k] + nums[i];
            max_sum = Math.max(max_sum, sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        Subarray_max_sum obj = new Subarray_max_sum();
        int[] nums = {1,12,-5,-6,50,3};
        int k = 3;
        System.out.println(obj.maxSubArray(nums, k));
    }
}
