class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int current = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                current++;
                if(current > max) {
                max = current;
            } 
            } else if(ch == ')') {
                current--;
            }
        }
        return max;
    }
}