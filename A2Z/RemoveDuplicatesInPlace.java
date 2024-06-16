//inplace
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int n=nums.length;
        for(int j = 1; j < n; j++){
            if(nums[i] != nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
    return i+1;
    //return nums;    
    }
}

//using set
//not inplace
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (!set.contains(curr)) {
                set.add(curr);
                nums[index++] = curr;
            }
        }

        return index;
    }
}
