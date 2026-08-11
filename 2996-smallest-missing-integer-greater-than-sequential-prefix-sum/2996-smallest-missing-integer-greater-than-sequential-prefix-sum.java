class Solution {
    public int missingInteger(int[] nums) {

        int i = 1;
        int largest = nums[0];

        // Find sequential prefix sum
        while (i < nums.length && nums[i] == nums[i - 1] + 1) {
            largest += nums[i];
            i++;
        }

        Arrays.sort(nums);

        // Find smallest missing >= largest
        for (int num : nums) {
            if (num == largest) {
                largest++;
            }
        }

        return largest;
    }
}