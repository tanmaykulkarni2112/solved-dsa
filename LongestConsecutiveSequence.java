class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1){
            return 1;
        }

        Arrays.sort(nums);
        int rn = 1;
        int count = 1;

        for(int i = 0; i < nums.length - 1; i++){
            // duplicates logic
            if(nums[i] == nums[i + 1]){
                continue; 
            }
            if(nums[i] + 1 == nums[i + 1]) {
                count++;
            } else {
                rn = Math.max(rn, count);
                count = 1; 
            }
        }
        
        //check and update rn in case the longest sequence is at the end
        //say from 4 to 6
        rn = Math.max(rn, count);
        return rn;
    }
}
