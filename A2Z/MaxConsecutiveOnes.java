//check if optimal logic available
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int longest = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                count++;
                if (count > longest){
                    longest = count;
                }
            } else {
                count = 0;
            }
        }
        return longest;
    }
}
