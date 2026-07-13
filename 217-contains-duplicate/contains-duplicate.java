class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int elem : nums){
            set.add(elem);
        }

        if(set.size() == nums.length) return false;
        return true;
    }
}