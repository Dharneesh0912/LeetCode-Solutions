// Last updated: 8/8/2026, 2:58:04 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int i=0;
        int j=mat[0].length-1;
        int sum=0;
        for(int k=0;k<mat.length;k++){
            if(i==j){
                sum+=mat[k][i++];
                j--;
                continue;
            }
            sum+=mat[k][i++];
            sum+=mat[k][j--];
        }
        return sum;
    }
}