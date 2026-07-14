// Last updated: 7/14/2026, 1:53:18 PM
import java.util.*;
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<=fruits.length-1;i++){
            list1.add(fruits[i]);
        }
        for(int i=0;i<fruits.length;i++){
            list2.add(baskets[i]);
        }
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<list2.size();j++){
                if(fruits[i]<=list2.get(j)){
                    list2.remove(j);
                    break;
                }
            }
        }
        return list2.size();
        
    }
}