class Solution {
    public void rotate(int[] nums, int k) {
        
         int n = nums.length;
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            v[(i + k) % n] = nums[i];
        }

        // Copy the rotated array back to nums
        for (int i = 0; i < n; i++) {
            nums[i] = v[i];
        }

    }
}