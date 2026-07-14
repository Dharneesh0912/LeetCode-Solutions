// Last updated: 7/14/2026, 2:15:17 PM
class Solution {
    public void rotate(int[][] matrix) {
        int size1=matrix.length;
        int size2=matrix[0].length;
        int arr[][]=new int[size1][size2];
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                arr[i][j]=matrix[size1-1-j][i];
            }
        }
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                matrix[i][j]=arr[i][j];
            }
        }
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                System.out.print(matrix[i][j]);
            }
        }
        
    }
}