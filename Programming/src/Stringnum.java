//import java.util.Scanner;
//public class Stringnum {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter The String :");
//		String a = sc.next();
//		for(int i=0; i<a.length();i++) {
//			System.out.println(a.charAt(i));
//		}
//	}
//}
//public class Stringnum {
//	public static void main(String[] args) {
//		String s = "hello@world";
//		for(int i=0; i<s.length(); i++) {
//			char a = s.charAt(i);
//			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
//				System.out.println(a);
//			}
//		}
//	}
//}
//public class Stringnum {
//	public static void main(String[] args) {
//		String s = "hello@88";
//		int alpha= 0, num=0, sc = 0;
//		for(int i=1; i<s.length(); i++) {
//			char a = s.charAt(i);
//			if((a>='a' && a<='z') || (a>='A'&&a<='Z')){
//				alpha++;
//			}
//			else if(a>='0'&&a<='9') {
//				num++;
//			}
//			else {
//				sc++;
//			}
//		}
//		System.out.println("Alpha: "+alpha);
//		System.out.println("Numeraric: "+num);
//		System.out.println("Special: "+sc);
//	}
//}
//public class Stringnum {
//	public static void main(String[] args) {
//		String s = "jspiders@123hi";
//		int c = 0; String ans=" ";
//		for (int i = 0; i <= s.length(); i++) {
//			char a = s.charAt(i);
//			if (a >= 'a' && a <= 'z') {
//				c-=32;
//				ans = ans+c;
//			}
//			else if(a>='A' && a<='Z') {
//				c+=32;
//				ans = ans+c;
//			}else {
//				ans = ans+c;
//			}
//		}
//		System.out.println(ans);
//	}
//}
