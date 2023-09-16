package STRING;

public class CaseConversion {  
	public static String caseConvert(String str) {  
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++) { 
			if(ch[i]>='A' && ch[i]<='Z') { 
				ch[i]=(char)(ch[i]+32);
			}else 
				if(ch[i]>='a' && ch[i]<='z'){ 
					ch[i]=(char)(ch[i]-32);
		}
	}
	return new String(ch); 
	} 
	public static void main(String[] args) {
		String s="Hello Sabaat!! Have A Good Day"; 
		System.out.println(caseConvert(s));
	}

}
