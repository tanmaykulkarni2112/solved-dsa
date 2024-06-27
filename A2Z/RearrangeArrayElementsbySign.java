class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] positive = new int[nums.length / 2]; 
        int[] negative = new int[nums.length / 2]; //Even number of + and - 
        int pcounter = 0;
        int ncounter = 0;


        // Step 1 Separate positive and negative numbers
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                positive[pcounter]= nums[i];
                pcounter++;
            } else {
                negative[ncounter] = nums[i];
                ncounter++;
            }
        }

        // Step 2 Placing the + - alternatingly 
        int count = 0; //placing the POsitive numbers 
        for(int i = 0; i < positive.length; i++) {
            nums[count] = positive[i];
            count += 2;
        }

        count = 1; //start placing negative from index 1
        for(int i = 0; i < negative.length; i++) {
            nums[count] = negative[i];
            count += 2;
        }

        return nums;
    }
}
