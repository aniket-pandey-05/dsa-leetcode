class Solution {
    public boolean splitIsPos(int[] nums, int k, int limit) {
        int sum = 0;
        int parts = 1;

        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] > limit) {
                parts++;
                sum = nums[i];
            } else {
                sum += nums[i];
            }
        }

        return parts <= k;
    }
    public int splitArray(int[] nums, int k) {

    int min = nums[0];
    int max = 0;
    int res = 0;

    for(int i = 0; i < nums.length; i++) {
        min = Math.max(min, nums[i]);
        max += nums[i];
    }

    while(min <= max) {

        int mid = min + (max - min) / 2;

        if(splitIsPos(nums, k, mid)) {
            res = mid;
            max = mid - 1;
        }
        else {
            min = mid + 1;
        }
    }

    return res;
    }
}