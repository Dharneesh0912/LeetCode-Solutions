// Last updated: 8/8/2026, 2:57:38 PM
class Solution {
    public int countGoodSubstrings(String s) {
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<=s.length()-3;i++){
            String val="";
            for(int j=i;j<i+3;j++){
                if(val.contains(Character.toString(s.charAt(j)))){
                    break;
                }
                val+=Character.toString(s.charAt(j));
            }
            if(val.length()==3){
                arr.add(val);
            }
        }
        return arr.size();
    }
}