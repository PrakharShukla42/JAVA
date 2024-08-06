package SectionAA;

public class Array7 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Array6 solution = new Array6();
        int[] result = solution.self(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
	    public int[] self(int[] nums) {
	        int n = nums.length;
	        int[] leftProducts = new int[n];
	        int[] rightProducts = new int[n];
	        leftProducts[0] = 1;
	        rightProducts[n - 1] = 1;
	        for (int i = 1; i < n; i++) {
	            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
	        }
	        for (int i = n - 2; i >= 0; i--) {
	            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
	        }
	        int[] result = new int[n];
	        for (int i = 0; i < n; i++) {
	            result[i] = leftProducts[i] * rightProducts[i];
	        }
	        return result;
	    }
    }
}

        