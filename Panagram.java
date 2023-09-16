package STRING;

public class Panagram { 
	    public static boolean isPangram(String sentence) {
	        boolean[] charPresent = new boolean[26];
	        sentence = sentence.toLowerCase();

	        for (int i = 0; i < sentence.length(); i++) {
	            char c = sentence.charAt(i);
	            if(c>='a' && c<='z') { 
					charPresent[c-97]=true;
				}
	        }
	        
	        for (boolean present : charPresent) {
	            if (present) {
	                return true;
	            }
	        }
	        return false;
	    } 
	    public static void main(String[] args) {
	        String st = "The quick brown fox jumps over the lazy dog";
	        
	        if (isPangram(st)) {
	            System.out.println("Pangram.");
	        } else {
	            System.out.println("Not an pangram.");
	        }
	    }
	}
