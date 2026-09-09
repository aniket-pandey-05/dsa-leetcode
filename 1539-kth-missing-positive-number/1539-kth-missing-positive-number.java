class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> missing = new ArrayList<Integer>();
        int min = 0;
        int max = arr.length-1;
        while(min <= max){
            int mid = min + (max-min)/2;
            if(arr[mid] - (mid+1) < k) min = mid+1;
            else max = mid-1;
        }
        return k+min;
    }
}