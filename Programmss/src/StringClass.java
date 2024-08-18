//public class StringClass {
//	public static int fab(int n) {
//		if (n <= 1) {
//			return n;
//		} 
//		else {
//			return fab(n - 1) + fab(n - 2);
//		}
//	}
//
//	public static void main(String[] args) {
//		int p = 10;
//		for (int i = 0; i <= p; i++) {
//			System.out.println(fab(i));
//		}
//	}
//}
//public class StringClass {
//	public static void main(String[] args) {
//		String str = "hello@88";
//		int alpha = 0; int num=0, sc =0;
//		for(int i=0; i<str.length();i++) {
//			char c= str.charAt(i);
//			if((c >= 'A' && c <= 'z') && (c >= 'a' && c<='z')) {
//				alpha++;
//			}
//			else if(c>='0'&& c<='9') {
//				num++;
//			}
//			else {
//				sc++;
//			}
//		}
//		System.out.println(alpha);
//		System.out.println(num);
//		System.out.println(sc);
//	}
//}