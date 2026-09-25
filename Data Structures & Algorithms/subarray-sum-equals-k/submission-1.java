// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int n = nums.length;
//         int sum = 0;
//         int c = 0;
//         for(int i=0;i<n;i++){
//             sum = 0;
//             for(int j=i;j<n;j++){
//                   sum += nums[j];
//                 if(sum == k){
//                     c++;
//                 }
//             }
//         }
//         return c;
//     }
// }

class Solution{
    public int subarraySum(int[] nums , int k){
        Map<Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        int c = 0;
        int curr = 0;
        for(int i=0;i<nums.length;i++){
            curr += nums[i];
            int diff = curr - k;
            if(map.containsKey(diff)){
                c += map.get(diff);
            }
            map.put(curr , map.getOrDefault(curr , 0)+1);
        }
        return c;
    }
}