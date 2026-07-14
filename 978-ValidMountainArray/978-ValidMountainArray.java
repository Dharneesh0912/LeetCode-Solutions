// Last updated: 7/14/2026, 2:12:13 PM
class Solution {
    public boolean validMountainArray(int[] arr) {
        int max=Integer.MIN_VALUE;
        if(arr.length<3){
            return false;
        }
        int index=0;
        boolean b=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        if(index==arr.length-1 || index==0){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(i<index){
                if(arr[i]>=arr[i+1]){
                    return false;
                }
            }
            if(i>index){
                if(arr[i-1]<=arr[i]){
                    return false;
                }
            }
        }
        return b;
               
    }
}