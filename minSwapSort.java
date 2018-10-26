//More test cases required
//Minimum swap required for sorting. Return true if 1 swap sort the array, return false otherwise
import java.util.*; 
public class MinSwapSort{
  public static void main(String[] args){
    //List<Integer[]> testCases = new ArrayList<Integer[]>();  
    int[] A1 = {1, 5, 3, 3, 2, 6};
    //testCases.add(A1);
    int[] A2 = {4, 3, 2, 1};
    //testCases.add(A2);
    int[] A3 = {1, 5, 4, 3, 2};
    //testCases.add(A3);
    int[] A4 = {3, 1, 2, 4};
    //testCases.add(A4);
    int[] A5 = {7, 1, 3, 2, 4, 5, 6};
    //testCases.add(A5);
    
    
    boolean result1 = solution(A1);
    for(int i=0; i<A1.length; i++){
        System.out.println("i="+i+": "+A1[i]);
    }
    boolean result2 = solution(A2);
    for(int i=0; i<A2.length; i++){
        System.out.println("i="+i+": "+A2[i]);
    }
    
    boolean result3 = solution(A3);
    for(int i=0; i<A3.length; i++){
        System.out.println("i="+i+": "+A3[i]);
    }
    boolean result4 = solution(A4);
    for(int i=0; i<A4.length; i++){
        System.out.println("i="+i+": "+A4[i]);
    }
    boolean result5 = solution(A5);
    for(int i=0; i<A5.length; i++){
        System.out.println("i="+i+": "+A5[i]);
    }
    System.out.print("A1 Expect True, returned " + result1
                     +" A2 Expect False, returned " + result2
                     +" A3 Expected False, returned " + result3
                     +" A4 Expected False, returned " + result4
                     +" A5 Expected False, returned "+ result5);
   }

public static boolean solution(int[] A){
    int sortA[]=new int[A.length];
    int count = 0;
    for(int i=0; i<A.length; i++){
        sortA[i]=A[i];
    }
    Arrays.sort(sortA);
    for(int i=0; i<A.length; i++){
        if(A[i]!=sortA[i]){
        count++;
     }
    }
    return count<=2;
    }
}
