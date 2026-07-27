class Solution {
    public int[] leftRightDifference(int[] arr) {
        int n = arr.length;
        int[] leftSum = new int[n];
        leftSum[0] = 0;
        int[] rightSum = new int[n];
        rightSum[n-1] = 0;
        int[] ans = new int[n];

        for(int i = 1; i<n; i++){
            leftSum[i] = leftSum[i-1]+arr[i-1];
        }

        for(int i = n-2; i>=0; i--){
            rightSum[i] = rightSum[i+1]+arr[i+1];
        }

        for(int i = 0; i<n; i++){
            ans[i] = leftSum[i]-rightSum[i];
            if(ans[i]<0){
                ans[i] = 0-ans[i];
            }
        }
        return ans;
    }
}