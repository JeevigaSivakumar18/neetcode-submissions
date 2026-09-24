class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        int len = nums.length;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
        }
        List<Integer> arr = new ArrayList<>();
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            int n = entry.getValue();
            if(n > len/3){
                arr.add(entry.getKey());
            }
        }
        return arr;
    }
}