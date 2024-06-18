//moore voting algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;
        int freq = 0;
        for(int i = 0; i < nums.length; i++) { 
            if(count == 0) {
                element = nums[i];
                count = 1; 
            } 
            else if(element == nums[i]) {
                count++;
            }
            else{
                count--;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(element == nums[i]) {
                freq++;
            }
        }
        if(freq > nums.length/2) {
            return element;
        }
        return -1;
    }
}

//non optimal
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
