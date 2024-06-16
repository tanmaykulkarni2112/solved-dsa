class Solution {
    public int[] rotate(int[] nums, int k) {
        //arr[i+k]%n = arr[i]
        int temp[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            temp[(i+k)% nums.length] = nums[i];
        }
        System.arraycopy(temp, 0, nums, 0, nums.length);
        return nums;
    }
}
