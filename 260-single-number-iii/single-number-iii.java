class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int elem : nums){
            if(map.containsKey(elem)){
                map.put(elem, map.get(elem)+1);
            }else{
                map.put(elem,1);
            }
        }
        int idx = 0;
        int[] arr = new int[2];
        for(int i = 0; i<nums.length; i++){
            if(map.get(nums[i]) == 1){
                arr[idx] = nums[i];
                idx++;
            }
        }
        return arr;
    }
}