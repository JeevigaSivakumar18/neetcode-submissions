class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Arrays.sort(nums1);
        int i=0;
        if(nums2.length == 0){
            return;
        }
        int j =0;
        while(j < n){
            while(nums1[i] != 0){
                i++;
            }
            nums1[i] = nums2[j];
            j++;
            i++;
        }
        Arrays.sort(nums1);
    }
}