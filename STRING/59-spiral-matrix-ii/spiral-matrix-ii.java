class Solution {
    public int[][] generateMatrix(int n) {
        int[][]matrix=new int [n][n];
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        int num=1;
        while(top<=bottom && left<=right){

        //left se right
        for(int i=left;i<=right;i++){
            matrix[top][i] = num++;
        }
        top++;
        //top se bottom 
        for(int j=top;j<=bottom;j++){
            matrix[j][right]=num++;
        }
        right--;
        //right to left
        for(int i=right;i>=left;i--){
            matrix[bottom][i]=num++;
        }
        bottom--;
        //bottom se top
        for(int j=bottom;j>=top;j--){
            matrix[j][left]=num++;
        }
        left++;
    }
    return matrix;
    }
}
        
   