//g4g problem to be understood 
//https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0?category
class Solution {
    
    public static long pairWithMaxSum(long arr[], long N)
    {
        long sum = Long.MIN_VALUE;
        long max = Long.MIN_VALUE;
        for (int i = 0; i < N-1; i++){
            sum = arr[i] + arr[i+1];
            if(sum > max){
                max = sum;
            }
            
        }
        return max;
    }
}


//kadane algorithm
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int max = nums[0];
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }   
}
