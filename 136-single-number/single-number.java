class Solution {
    public int singleNumber(int[] nums) {
        int unique = 0;
        for(int elem : nums){
            unique ^= elem;
        }
        return unique;
    }
}