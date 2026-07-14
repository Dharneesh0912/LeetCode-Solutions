// Last updated: 7/14/2026, 2:12:23 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        ArrayList<Character> arr=new ArrayList<>();
        ArrayList<Character> arr1=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(arr.size()!=0){
                    arr.remove(arr.size()-1);
                }
            }
            else{
                arr.add(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(arr1.size()!=0){
                    arr1.remove(arr1.size()-1);
                }
            }
            else{
                arr1.add(t.charAt(i));
            }
        }
        String a="";
        String b="";
        for(int i=0;i<arr.size();i++){
            a+=Character.toString(arr.get(i));
        }
        for(int i=0;i<arr1.size();i++){
            b+=Character.toString(arr1.get(i));
        }
        return a.equals(b);
        
    }
}