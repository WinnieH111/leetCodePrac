//7ms, need a faster solution
class Solution {
      public String[] findWords(String[] words) {
        List<Character> row1 = Arrays.asList('Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P');
        List<Character> row2 = Arrays.asList('A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L');
        List<Character> row3 = Arrays.asList('Z','X', 'C', 'V', 'B', 'N', 'M');
        int row1C = 0;
        int row2C = 0; 
        int row3C = 0;
        ArrayList<String> oneRowWords = new ArrayList<String>();
        for(String word:words){
            String upCaseword = word.toUpperCase();
            for(int i=0; i<word.length(); i++){
                if(row1.contains(upCaseword.charAt(i))) row1C++;
                if(row2.contains(upCaseword.charAt(i))) row2C++;
                if(row3.contains(upCaseword.charAt(i))) row3C++;
            }
            if(row1C == word.length() || row2C == word.length() || row3C == word.length()){
                oneRowWords.add(word);
            }
            System.out.println("Row1C = "+row1C+" Row2C = "+row2C+" Row3C = "+row3C);
            row1C=0;
            row2C=0;
            row3C=0;   
            }
        String[] result = new String[oneRowWords.size()];
        result = oneRowWords.toArray(result);
        return result;
        }
    }
