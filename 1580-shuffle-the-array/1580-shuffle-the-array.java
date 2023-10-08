class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] temp = new int[n];
        
        for (int i = 0; i < n; i++) {
            temp[i] = nums[i];  // Storing first half of the array
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            nums[count++] = temp[i];
            nums[count++] = nums[i + n];
        }

        return nums;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = sol.shuffle(nums, n);
        for (int i : result) {
            System.out.print(i + " ");
        }
        // Output: 2 3 5 4 1 7 
    }
}
