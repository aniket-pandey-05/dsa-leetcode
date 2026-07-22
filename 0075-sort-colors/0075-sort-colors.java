class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        while(k < nums.length){
            if(nums[k] == 0){
                i++;
            }
            else if(nums[k] == 1){
                j++;
            }
            else l++;

            k++;
        }
        k=0;
        while(k < nums.length){
            if(i!=0){
                nums[k] = 0;
                i--;
            }
            else if(j!=0){
                nums[k] = 1;
                j--;
            }
            else nums[k] = 2;

            k++;
        }
    }
}