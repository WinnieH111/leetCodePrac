class Solution {
    public int uniqueLetterString(String S) {
       int result = 0;
       //if(uniqNum == 0) return 0;
       for(int i=0; i<S.length(); i++){
           for(int j = i+1; j<=S.length();j++){
                 
                  result+= uniq(S.substring(i, j));  
           }
       }
        return (int)result%((int)Math.pow(10, 9)+7);
       //return result;
    }
    
 	public int uniq(String S){  
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<S.length(); i++) {
			 Character key = S.charAt(i);
			 if(map.get(key)==null) {
				map.put(key, new Integer(1));
			 }
			 else {
				map.put(key, map.get(key)+1);
					}     
		}
        
		return Collections.frequency(map.values(), 1);
	}
}
