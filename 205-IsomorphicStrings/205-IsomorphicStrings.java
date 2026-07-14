// Last updated: 7/14/2026, 2:14:11 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        if(s.length()==0 || t.length()==0){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                if(map.containsValue(t.charAt(i))) {
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
            }
            if(map.get(s.charAt(i))!=t.charAt(i)){
                return false;
            }
            
        }
        return true;
    }
}