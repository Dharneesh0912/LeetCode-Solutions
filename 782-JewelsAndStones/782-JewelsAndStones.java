// Last updated: 7/14/2026, 2:12:31 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char jewel[]=jewels.toCharArray();
        char stone[]=stones.toCharArray();
        int count=0;
        for(int ch=0;ch<jewels.length();ch++){
            for(int cha=0;cha<stones.length();cha++){
                if(jewel[ch]==stone[cha]){
                    count++;
                }
            }
        }
        return count;

        
    }
}