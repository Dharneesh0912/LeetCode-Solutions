// Last updated: 7/27/2026, 11:10:08 AM
class Solution {
    public String[] findWords(String[] words) {
        String arr[]={"qwertyuiopQWERTYUIOP","asdfghjklASDFGHJKL","zxcvbnmZXCVBNM"};
        ArrayList<String> str=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            for(int j=0;j<words.length;j++){
                String c=words[j];
                boolean b=true;
                for(int k=0;k<c.length();k++){
                    if(!s.contains(Character.toString(c.charAt(k)))){
                        b=false;
                        break;
                    }
                }
                if(b){
                    str.add(c);
                }
            }    
        }
        String ans[]=new String[str.size()];
        for(int i=0;i<str.size();i++){
            ans[i]=str.get(i);
        }
        return ans;
    }
}