//Brute Force, time limitation excess.
class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int maxResult = 0;

        for(int i=0; i<(height.length-1); i++){
            for(int j=i+1; j<height.length; j++){
               result = Math.min(height[i], height[j]) * (j-i);
                System.out.println("Result is "+ result);
               if(result>maxResult){
                   maxResult = result;
               }
                
            }
        }
        return maxResult; 
    }
}
