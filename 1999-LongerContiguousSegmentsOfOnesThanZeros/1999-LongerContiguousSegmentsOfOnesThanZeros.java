// Last updated: 8/7/2026, 12:14:41 PM
class Solution {
    public boolean checkZeroOnes(String s) {
        int oc=0;
        int zc=0;
        int max=-1;
        int max1=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                oc++;
                max1=Math.max(max1,zc);
                zc=0;
            }
            if(s.charAt(i)=='0'){
                zc++;
                max=Math.max(max,oc);
                oc=0;
            }    
        }
        max = Math.max(max, oc);
        max1 = Math.max(max1, zc);
        if(max==max1){
            return false;
        }
        if(max<max1){
            return false;
        }
        return true;
    }
}