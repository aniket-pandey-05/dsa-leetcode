class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums.length == 0) return list;
        if(nums.length == 1 || (nums.length == 2 && nums[0] == nums[1])) {
            list.add(nums[0]);
            return list;
        }
        if(nums.length == 2){
            list.add(nums[0]);
            list.add(nums[1]);
            return list;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(Integer key : map.keySet()){
            if(map.get(key) > nums.length/3) list.add(key);
        }

        return list;
    }
}