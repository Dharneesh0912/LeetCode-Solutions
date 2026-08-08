// Last updated: 8/8/2026, 2:58:11 PM
class Solution {
    public String thousandSeparator(int n) {
        StringBuffer ans=new StringBuffer();
        String val=Integer.toString(n);
        int count=0;
        for(int i=val.length()-1;i>=0;i--){
            if(count==3){
                ans.append(".");
                ans.append(val.charAt(i));
                count=1;
                continue;
            }
            ans.append(val.charAt(i));
            count++;
        }
        ans.reverse();
        return ans.toString();
    }
}