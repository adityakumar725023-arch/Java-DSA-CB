class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0){
            //last digit nikalo
            int digit=x%10;
            // last digit remove kar do
            x=x/10;
            rev=rev*10+digit;
        }
            //check 32 bit range
            if(rev>Integer.MAX_VALUE|| rev<Integer.MIN_VALUE){
                return 0;
            }
        return (int)rev;
  
    }
}