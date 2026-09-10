class Solution {
    public void moveZeroes(int[] nums) {
        int pos=0;
        // non-zero element ko aayge lao
        for( int i=0 ; i<nums.length ;i++){
            if (nums[i]!=0){
                nums[pos]=nums[i];
                pos++;
            }
        }
//remainging position ko zero kro
while (pos<nums.length){
    nums[pos]=0;
    pos++;
    }
}
}