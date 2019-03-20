// Java code to roll the string
import java.util.stream.IntStream;
import java.util.*;
class StringRoller {
	/*public static String roll(String toRoll, int roll[]) {
		String result = toRoll;
		for(int i=0; i<roll.length; i++){
                    result = roll_character(result, roll[i]);
                    System.out.println("Result "+result);
         	}
		return result;

	}

	public static String roll_character(String str, int roll) {
	    int r = roll-1;
	    if(r == 0){
	        return (char)((str.charAt(0)-'a'+1)%26+'a')+str.substring(1);
	    }
	    else {
		String result=(str.substring(0,r))+(char)((str.charAt(r)-'a'+1)%26+'a')+str.substring(r+1);
	       	 System.out.println("Result in recurssion "+result);
                 return  roll_character(result, roll-1);
            }
        } */
			public static String roll(String toRoll, int roll[]){
				StringBuilder s = new StringBuilder();
				s.append(toRoll);
				//List<Integer> roll_time = new ArrayList<Integer>();
				int[] roll_time = new int[toRoll.length()];
				for(int i=0; i<roll_time.length; i++){
					roll_time[i]=0;
				}
				for(int r:roll){
					for(int i=0; i<r; i++){
						roll_time[i]+=1;
					}
				}
				for(int i=0; i<toRoll.length(); i++){
					s.setCharAt(i, roll_char(toRoll.charAt(i), roll_time[i]));
				}

				return s.toString();
			}

			public static char roll_char(char c, int roll){
				int r = roll%26;
				return (char)((c-'a'+r)%26+'a');
			}


	// Driver code
	public static void main(String[] args) {
		String s = "geeks";
		int k[] = {1, 2, 5};
		System.out.println(roll(s, k));
	}
}
