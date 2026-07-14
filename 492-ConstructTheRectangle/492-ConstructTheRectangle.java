// Last updated: 7/14/2026, 2:13:11 PM
class Solution {
    public int[] constructRectangle(int area) {
        int root=(int)Math.sqrt(area);
        int arr[]=new int[2];
        int l=0;
        while(area%root!=0){
            root--;
        }
        int w=area/root;
        if(w>root){
            arr[0]=w;
            arr[1]=root;
        }
        else{
            arr[0]=root;
            arr[1]=w;
        }
        return arr;


        
    }
}