// Last updated: 7/25/2026, 9:44:46 AM
class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(n!=0){
            arr.add(n%10);
            n=n/10;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.size()-1;i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i)*arr.get(j)>max){
                    max=arr.get(i)*arr.get(j);

                }
            }
        }
        return max;
        
    }
}