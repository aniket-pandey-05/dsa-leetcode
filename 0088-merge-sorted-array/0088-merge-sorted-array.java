class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int i = 0 ; int j = 0; int a = 0;
        while(i < m && j < n){
            if(nums1[i]<nums2[j]){
                arr[a++] = nums1[i++];
            } 
            else {
                arr[a++] = nums2[j++];
            }
        }
        while(i < m){
            arr[a++] = nums1[i++];
        }
        while(j < n){
            arr[a++] = nums2[j++];
        }
        for(int z =0 ; z < nums1.length ; z++){
            nums1[z] = arr[z];
        }
    }
}