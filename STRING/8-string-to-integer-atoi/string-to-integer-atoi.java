class Solution {
    public int myAtoi(String s) {
        int i=0;
        int sign=1;
        long num=0;
        //1.starting spaces skip kro
        while (i<s.length()&& s.charAt(i)==' ')
        {
            i++;
        }
        //2.+ya - check kro
        if(i<s.length()&&s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(i<s.length()&&s.charAt(i)=='+'){
            i++;
        }
        //3.digit read kro
        while (i<s.length()&&Character.isDigit(s.charAt(i))){
            //number bnao
            num=num*10+(s.charAt(i)-'0');
            //32 bit range check
            if(sign*num>Integer.MAX_VALUE)
            {
                return Integer.MAX_VALUE;
            }
            if(sign*num<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return(int)(sign*num);   
    }
}