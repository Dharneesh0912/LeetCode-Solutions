// Last updated: 7/14/2026, 1:53:26 PM
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int arr[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            int count=0;
            for(int k=0;k<=i;k++){
                for(int j=0;j<=i;j++){
                    if(A[k]==B[j]){
                        count++;
                    }
                }
            }
            arr[i]=count;
        }
        return arr;
    }
}