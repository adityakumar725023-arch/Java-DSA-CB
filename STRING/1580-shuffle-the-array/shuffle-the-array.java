class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans =new int [nums.length];
        int e=0;
        int o=n;
        for( int i=0;i<nums.length;i++){
            if(i%2==0){
                ans[i]=nums[e];
                e++;
            }else{
                ans[i]=nums[o];
                o++;
            }
        }
        return ans;
        
    }
}