class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int j = 0;
        double max_sum = 0;
        double sum = 0;
        while(j<k){
            sum += nums[j];
            max_sum += nums[j];
            j++;
        }

        for(int i = 1; i<=nums.length-k;i++){
            sum = sum-nums[i-1]+nums[i+k-1];
            if(sum>max_sum){
                max_sum = sum;
            }
        }

        return max_sum/k;
    }
}