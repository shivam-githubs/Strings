package STRING;

public class Anagram {

    public static boolean areAnagrams(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        boolean[] charCount = new boolean[26];
        word1 = word1.toLowerCase(); 
        word2=word2.toLowerCase();
 
        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            if(c>='a' && c<='z') { 
				charCount[c-97]=true; 
			} 
            for (int j = 0; j < word2.length(); j++) {
                char c1 = word2.charAt(j);
                if(c1>='a' && c1<='z') { 
    				charCount[c1-97]=true; 
    			}  
            } 
        } 
        
        for (boolean present : charCount) {
        	if (present) {
        		return true; 
        	} 
        }
	        	return false;
     }
    public static void main(String[] args) {
        String word1 = "keep";
        String word2 = "peek"; 
        
        if (areAnagrams(word1, word2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }
}
