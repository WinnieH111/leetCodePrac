public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int result = 0;
        Map<Integer, Integer> socketMap = new HashMap<Integer, Integer>();
        for(int i:ar){
           socketMap.put(i, (socketMap.get(i)==null?1:socketMap.get(i)+1));
        }
        for(Map.Entry<Integer, Integer> entry:socketMap.entrySet()){
            if(entry.getValue()>=2) result+=entry.getValue()/2;
        }
        return result;
    }
