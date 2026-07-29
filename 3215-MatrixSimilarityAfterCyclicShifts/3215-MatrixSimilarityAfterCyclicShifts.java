// Last updated: 7/29/2026, 12:14:46 PM
class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int n=k;
        int t[][]=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                t[i][j]=mat[i][j];
            }
        }
        while(n!=0){
            for(int i=0;i<mat.length;i++){
                if(i%2!=0){
                    int temp=mat[i][mat[i].length-1];
                    for(int j=mat[i].length-1;j>0;j--){
                        mat[i][j]=mat[i][j-1];
                    }
                    mat[i][0]=temp;    
                }
                if(i%2==0){
                    int temp=mat[i][0];
                    for(int j=0;j<mat[i].length-1;j++){
                        mat[i][j]=mat[i][j+1];
                    }
                    mat[i][mat[i].length-1]=temp;    
                }
            }
            n--;
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]!=t[i][j]){
                    return false;
                }
            }
        }
        return true;
        
    }
}