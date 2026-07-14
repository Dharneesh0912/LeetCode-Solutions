// Last updated: 7/14/2026, 2:13:32 PM
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                arr.add(matrix[i][j]);
            }
        }
        Collections.sort(arr);
        if(k>arr.size()){
            return -1;
        }
        return arr.get(k-1);
        
    }
}