class Solution {
    public int findNumbers(int[] nums) {
       int count=0;
       for(int i = 0; i < nums.length; i++) {
        String number = String.valueOf(nums[i]); //convert number into string
        if(number.length()%2 == 0) {
            count++;
        }
       }
       return count;
    }
}
