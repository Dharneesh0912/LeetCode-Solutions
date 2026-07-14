// Last updated: 7/14/2026, 2:13:39 PM
class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            String val=Integer.toBinaryString(i);
            HashMap<Character,Integer> map=new HashMap<>();
            for(int j=0;j<val.length();j++){
                map.put(val.charAt(j),map.getOrDefault(val.charAt(j),0)+1);
            }
            if(map.containsKey('1')){
                arr[i]=map.get('1');
            }
        }
        return arr;
    }
}