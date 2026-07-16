class Solution {
    public int diagonalSum(int[][] mat) {
        int i , j , sum = 0 , n=  mat.length;
        for(i = 0 ; i < mat.length ; i++){
            for(j = 0 ; j < mat[i].length; j++){
                if(i == j || i+j == n-1){
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}