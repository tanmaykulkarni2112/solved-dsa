//retry with  Boyer-Moore Voting Algorithm later

class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int majorityCount = nums.length / 2;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > majorityCount) {
                return num;
            }
        }
        return -1; 
    }
}
