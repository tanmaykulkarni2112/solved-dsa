//better solution
class Solution {
    public int removeElement(int[] nums, int val) {
        int curr = 0; // Pointer to track the position to place the next non-val element

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not val, place it at the curr position and increment curr
            if (nums[i] != val) {
                nums[curr] = nums[i];
                curr++;
            }
        }

        // Return the count of elements that are not equal to val
        return curr;
    }
}
