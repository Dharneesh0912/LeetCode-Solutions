// Last updated: 7/27/2026, 11:09:41 AM
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map=new HashMap<>();
        String arr[]=s1.split(" ");
        String arr2[]=s2.split(" ");
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr2.length;i++){
            map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
        }
        ArrayList<String> a=new ArrayList<>();
        for(String d:map.keySet()){
            if(map.get(d)==1){
                a.add(d);
            }
        }
        String ans[]=new String[a.size()];
        for(int i=0;i<a.size();i++){
            ans[i]=a.get(i);
        }
        return ans;
    }
}