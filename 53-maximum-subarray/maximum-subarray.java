class Solution {
    public int maxSubArray(int[] nums) {
        int v1 = nums[0];
        int v2 = nums[0];
        int ans= nums[0];


        for( int i=1;i<nums.length;i++){
            v1= v1 + nums[i];
         v2=nums[i];

           v1=Math.max(v1,v2);
        
            ans=Math.max(ans,v1);
    }
        return ans;
    }
}