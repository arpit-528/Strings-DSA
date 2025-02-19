class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left=0;
        int maxlen = 0;
        for(int right = 0; right < s.length(); right++) {
            if(map.containsKey(s.charAt(right))) {   //finding duplicates
                left = Math.max(left, map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right), right);
            maxlen = Math.max(maxlen, (right-left+1));
        }
        return maxlen;
    }
}
