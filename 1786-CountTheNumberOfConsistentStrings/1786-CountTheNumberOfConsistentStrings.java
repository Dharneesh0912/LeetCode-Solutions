// Last updated: 7/20/2026, 9:09:56 PM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            boolean b=true;
            for(int j=0;j<words[i].length();j++){
                if(!allowed.contains(Character.toString(words[i].charAt(j)))){
                    b=false;
                }
            }
            if(b){
                arr.add(words[i]);
            }
        }
        return arr.size();
    }
}