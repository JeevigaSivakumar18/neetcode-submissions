class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        // nums = new int[set.size()];
         int k = 0;
        for(int i : set){
            nums[k] = i;
            k++;
        }
        return set.size();
    }
}