// Last updated: 7/14/2026, 2:13:24 PM
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                l.add("FizzBuzz");
                continue;
            }
            if(i%3==0){
                l.add("Fizz");
                continue;
            }
            if(i%5==0){
                l.add("Buzz");
                continue;
            }
            else{
                String val=Integer.toString(i);
                l.add(val);
            }
        }
        return l;
        
    }
}