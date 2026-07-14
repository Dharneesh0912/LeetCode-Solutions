// Last updated: 7/14/2026, 2:12:41 PM
class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<operations.length;i++){
            if(!operations[i].equals("D") && !operations[i].equals("C") && !operations[i].equals("+")){
                arr.add(Integer.parseInt(operations[i]));
            }
            if(operations[i].equals("D")){
                if(arr.size()!=0){
                    arr.add(arr.get(arr.size()-1)*2);
                }
            }
            if(operations[i].equals("C")){
                if(arr.size()!=0){
                    arr.remove(arr.size()-1);
                }
            }
            if(operations[i].equals("+")){
                int sum=0;
                if(arr.size()>=2){
                    sum+=arr.get(arr.size()-1);
                    sum+=arr.get(arr.size()-2);
                }
                arr.add(sum);
            }
        }
        int s=0;
        for(int i=0;i<arr.size();i++){
            s+=arr.get(i);
        }
        return s;
    }
}