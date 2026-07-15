class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        int i = 0;
        int k = 0;
        while(i< nums.length && j < nums.length){
            if(nums[j] == val) {
                j++;
            }
            else if(nums[j]!=val && i != j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;k++;
            }
            else{
                k++;
                j++;
                i++;
            }
        }
        return k;
    }
}