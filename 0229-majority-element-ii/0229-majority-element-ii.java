class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int c1 = 0 ;
        int c2 = 0;
        int el1 = 0;
        int el2 = 0;
        for(int num:nums){
            if(c1 == 0 && num != el2){
                el1 = num;
                c1++;
            }
            else if(c2 == 0 && num != el1){
                el2 = num;
                c2++;
            }
            else if(num == el1)c1++;
            else if(num == el2)c2++;
            else {
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;

        for(int num : nums) {
            if(num == el1) c1++;
            else if(num == el2) c2++;
        }

        if(c1 > nums.length/3) list.add(el1);
        if(c2 > nums.length/3) list.add(el2);

        return list;
    }
}