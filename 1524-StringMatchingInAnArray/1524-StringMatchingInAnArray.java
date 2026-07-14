// Last updated: 7/14/2026, 2:11:37 PM
class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> lst=new HashSet<>();
        List<String> arr=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j){
                    if(words[i].contains(words[j])){
                        lst.add(words[j]);
                    }
                }
            }
        }
        for(String s:lst){
            arr.add(s);    
        }
        return arr; 
    }
}