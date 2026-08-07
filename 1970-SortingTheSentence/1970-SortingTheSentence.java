// Last updated: 8/7/2026, 12:14:44 PM
class Solution {
    public String sortSentence(String s) {
        String str[]=s.split(" ");
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<str.length;i++){
            map.put(Integer.parseInt(str[i].substring(str[i].length()-1,str[i].length())),str[i].substring(0,str[i].length()-1));
        }
        String ans="";
        String val[]=new String[map.size()+1];
        for(int i:map.keySet()){
            val[i]=map.get(i);
        }
        for(int i=1;i<val.length;i++){
            if(i==val.length-1){
                ans+=val[i];
            }
            else{
                ans+=val[i]+" ";
            }
        }
        return ans;

    }
}