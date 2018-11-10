
// My code 
// very slow 

import java.lang.Math;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0; j<nums.length; j++){
                if(i != j){
                    if(nums[i]+ nums[j] == target){
                        answer[0] = Math.min(i,j);
                        answer[1] = Math.max(i,j);
                        break;
                    }
                }
            
         }
        }
        return answer;
    }
}

// code which took only 5ms to complete

class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null) return new int[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{i,map.get(complement)};
            }
            else map.put(nums[i], i);
        }
        return new int[0];
    }
}
