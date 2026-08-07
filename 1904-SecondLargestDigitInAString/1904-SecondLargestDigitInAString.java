// Last updated: 8/7/2026, 11:17:17 AM
class Solution {
    public int secondHighest(String s) {
        Set<Integer> arr=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                arr.add(s.charAt(i)-'0');
            }
        }
        if(arr.size()==0 || arr.size()==1){
            return -1;
        }
        int ar[]=new int[arr.size()];
        int j=0;
        for(int i:arr){
            ar[j]=i;
            j++;
        }
        Arrays.sort(ar);
        return ar[ar.length-2];
    }
}