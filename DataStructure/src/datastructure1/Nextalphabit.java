package datastructure1;

public class Nextalphabit {
	public static void main(String[] args) {
		String s = "abDE67HsqZk";
		String c = "";
		for(int i = 0; i<s.length(); i++) {
			if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
				if(c =='z') {
					c = c+'a';
				}
				else if(c == 'Z') {
					
				}
			}
		}
	}

}
