class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxx = 0;
        int maxFreq = 0;
        List<Integer> arr = new ArrayList<>();
        while(k != 0){
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                maxx = entry.getKey();
            }
        }
        arr.add(maxx);
        map.remove(maxx);
        maxx = 0;
        maxFreq = 0;
        k--;
    }
     int[] anss = new int[arr.size()];
     for(int i=0;i<arr.size();i++){
        anss[i] = arr.get(i); 
     }
     return anss;
   }
} 
