class Solution {
    public int maxSubArray(int[] nums) {
        int count = 0;
        boolean isneg = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                count++;
            }
        }
        if (count == nums.length){
            isneg = true;
        }
        int max=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<nums.length;i++){
            if(cs<0){
                cs=0;
            }
            else if(isneg == true){
                cs=nums[i];
            }
            max=Math.max(cs,max);
        }
        return max;
    }
}