class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> dict = new HashMap<>();

        int[] answer = new int[2];
        int len = nums.length;

        for(int i = 0; i < len; i++){
            if(!dict.containsKey(target - nums[i])){
                dict.put(nums[i], i);
            }
            else {
                answer[1] = i;
                answer[0] = dict.get(target - nums[i]);
                break;
            }
        }

        return answer;
    }
}