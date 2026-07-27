class Solution {
    public int pivotIndex(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        int leftSum = 0;
        int rightSum = 0;

        for(int num:arr){
            totalSum += num;
        }

        for(int i = 0; i<n; i++){
            rightSum = totalSum-leftSum-arr[i];
            if(rightSum == leftSum){
                return i;
            }
            leftSum += arr[i];
        }

        return -1;
    }
}