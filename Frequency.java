package STRING;

public class Frequency {  
	public static void frequency(String str) { 
		int count[]=new int[26]; 
		
		for(int i=0;i<str.length();i++) { 
			char ch=str.charAt(i); 
			if(ch>='A' && ch<='Z') { 
				count[ch-65]++;
			}else 
				if(ch>='a' && ch<='z') { 
					count[ch-97]++;
				}
		} 
		
		for(int i=0;i<count.length;i++) { 
			if(count[i]!=0) {  
				System.out.println((char)(i+65)+"-->"+count[i]);
				//System.out.print((char)(i+65)+""+count[i]); OP:A1G2I1M2N1O1P1R2
			}
		}
	} 
	
	public static void main(String[] args) {
		String s="Programming"; 
		frequency(s);
	}
}
