package Day2;
public class Square {
     public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};

        int[] res = sortedSquares(arr);

        for (int x : res) {
            System.out.print(x + " ");
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;          // start of array
        int right = n - 1;     // end of array
        int index = n - 1;     // fill result from the back

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;        // move left pointer
            } else {
                result[index] = rightSquare;
                right--;       // move right pointer
            }

            index--;           // move fill position to the left
        }

        return result;
    }
}
