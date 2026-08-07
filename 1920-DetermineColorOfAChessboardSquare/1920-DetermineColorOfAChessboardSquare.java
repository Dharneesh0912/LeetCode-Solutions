// Last updated: 8/7/2026, 11:17:11 AM
class Solution {
    public boolean squareIsWhite(String coordinates) {
        boolean arr[][]=new boolean[8][8];
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('a',0);
        map.put('b',1);
        map.put('c',2);
        map.put('d',3);
        map.put('e',4);
        map.put('f',5);
        map.put('g',6);
        map.put('h',7);
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(i%2==0){
                    if(j%2==0){
                        arr[i][j]=false;
                    }
                    else{
                        arr[i][j]=true;
                    }
                }
                else{
                    if(j%2==0){
                        arr[i][j]=true;
                    }
                    else{
                        arr[i][j]=false;
                    }                   
                }
            }
        }
        return arr[map.get(coordinates.charAt(0))][(coordinates.charAt(1)-'0')-1];

    }
}