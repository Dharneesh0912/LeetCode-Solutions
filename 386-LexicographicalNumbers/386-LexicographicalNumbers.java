// Last updated: 7/14/2026, 2:13:30 PM
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> l1=new LinkedList<>();
        for(int i=1;i<=n;i++){
            l1.add(i);
        }
        Collections.sort(l1,(a,b)->String.valueOf(a).compareTo(String.valueOf(b)));
        return l1;
    }
}