class Solution {
    public void moveZeroes(int[] nums) {
        int write = 0;
        int temp;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                temp = nums[write];
                nums[write] = nums[i];
                nums[i] = temp;
                write+=1;
            }
        }
    }
}