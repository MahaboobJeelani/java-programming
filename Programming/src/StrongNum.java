//
//public class StrongNum {
//	static int fact(int n){
//		int fact = 1;
//		for(int i =1; i<=n; i++) {
//			fact = fact * i;
//		}
//		return fact;
//	}
//	public static void main(String[] args) {
//		int n=153; int n1 = n;
//		int sum = 0, rem = 0;
//		while(n!=0) {
//			rem = n%10;
//			int ans = fact(rem);
//			sum = sum + ans;
//			n = n/10;
//		}
//		if(sum == n1) {
//			System.out.println("Strong Number");
//		}
//		else {
//			System.out.println("Not a Strong Number");
//		}
//		
//	}
//
//}