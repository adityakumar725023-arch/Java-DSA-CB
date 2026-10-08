class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int n=nums.length;
        int countZeros=0;
        int ans=0;
        while (j<nums.length){
            if(nums[j]==0){
                countZeros++;
            }
            while(countZeros>k){
                if(nums[i]==0){
                    countZeros--;
                }
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}