class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hash_set = new HashSet<>();

        int length = s.length();

        int result = 0; // The current max
        int left_pointer = 0;
        int right_pointer = 0;

        while(right_pointer < length){
            if (!hash_set.contains(s.charAt(right_pointer))){
                hash_set.add(s.charAt(right_pointer));
                right_pointer++; //Increments to slide window
                result = Math.max(result, right_pointer - left_pointer);
            }
            else {
                hash_set.remove(s.charAt(left_pointer));
                left_pointer++; //Increments to slide the left side of the window
            }
        }

        return result;
    }
}