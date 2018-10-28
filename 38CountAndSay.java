class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        //n is depend on n-1's output... 
        String s = countAndSay(n-1);
        //System.out.println(s);
        //The new string will be... 
        String result = "";
        int count = 1;
        char lastChar = s.charAt(0);
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == lastChar){
                //Count the same digits
                count++;
            }
            else{
                //put count in front of the digit 
                result = result+(Integer.toString(count)) +lastChar;
                //record the new digit
                lastChar = s.charAt(i);
                //reset count
                count = 1;
            }
        }
        //if count is continue until the end...
        result = result+count+lastChar;
        return result;
    }
}
