class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int sum=0;
            while (num>=10){
                sum=sum+num%10;
                num=num/10;
            }
            num=sum+num;
        }
       return num; 
    }
}