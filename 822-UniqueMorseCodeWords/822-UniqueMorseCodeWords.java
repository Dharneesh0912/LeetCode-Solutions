// Last updated: 7/29/2026, 12:15:41 PM
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character,String> map=new HashMap<>();
        map.put('a', ".-");
        map.put('b', "-...");
        map.put('c', "-.-.");
        map.put('d', "-..");
        map.put('e', ".");
        map.put('f', "..-.");
        map.put('g', "--.");
        map.put('h', "....");
        map.put('i', "..");
        map.put('j', ".---");
        map.put('k', "-.-");
        map.put('l', ".-..");
        map.put('m', "--");
        map.put('n', "-.");
        map.put('o', "---");
        map.put('p', ".--.");
        map.put('q', "--.-");
        map.put('r', ".-.");
        map.put('s', "...");
        map.put('t', "-");
        map.put('u', "..-");
        map.put('v', "...-");
        map.put('w', ".--");
        map.put('x', "-..-");
        map.put('y', "-.--");
        map.put('z', "--..");
        String ans[]=new String[words.length];
        for(int i=0;i<words.length;i++){
            String w="";
            for(int j=0;j<words[i].length();j++){
                char c=Character.toLowerCase(words[i].charAt(j));
                w+=map.get(c);
            }
            ans[i]=w;
        }
        Set<String> n=new HashSet<>();
        for(int i=0;i<ans.length;i++){
            n.add(ans[i]);
        }
        return n.size();
    }
}