class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(!set.add(nums[i])){
                if(i-map.get(nums[i])<=k) return true;
            }
            set.add(nums[i]);
            map.put(nums[i],i);
        }
        return false;
    }
}