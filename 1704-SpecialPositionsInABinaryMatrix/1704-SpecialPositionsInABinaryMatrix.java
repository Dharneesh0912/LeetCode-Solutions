// Last updated: 7/28/2026, 1:48:58 PM
class Solution {
    public int numSpecial(int[][] mat) {
        int count=0;
        ArrayList<List<Integer>> arr=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    int oc=0;
                    for(int k=0;k<mat[i].length;k++){
                        if(mat[i][k]==1){
                            oc++;
                        }
                    }
                    for(int l=0;l<mat.length;l++){
                        if(mat[l][j]==1){
                            oc++;
                        }
                    }
                    if(oc==2){
                        count++;
                    }
                }
            }
        }
        return count;   
    }
}