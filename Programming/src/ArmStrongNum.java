//public class ArmStrongNum {
//	static int isFact(int n) {
//		int c = 0;
//		while(n!=0) {
//			c++;
//			n= n/10;
//		}
//		return c;
//	}
//	static boolean isArmStrong(int n) {
//		int sum = 0, n1 = n;
//		int digit = isFact(n);
//		while(n!=0) {
//			int rem = n%10;
//			sum = sum + isPower(rem,digit);
//			n = n/10;
//		}
//		return sum == n1;
//		
//	}
//	static int isPower(int ba, int expo) {
//		int pow = 1;
//		for(int i=1; i<=expo; i++) {
//			pow = pow*ba;
//		}
//		return pow;
//	}
//	public static void main(String[] args) {
//		int n = 153;
//		if(isArmStrong(n)) {
//			System.out.println("ArmStrong Number");
//		}
//		else {
//			System.out.println("Not a ArmStrong Number");
//		}
//	}
//}

//public class ArmStrongNum {
//	static int isCount(int n) {
//		int c = 0;
//		while(n!=0) {
//			c++;
//			n = n/10;
//		}
//		return c;
//	}
//	static int isPower(int base, int expo) {
//		int pow = 1;
//		for(int i=1; i<=expo; i++) {
//			pow = pow*base;
//		}
//		return pow;
//	}
//	static boolean isArmStrong(int num) {
//		int sum = 0; int original = num; int digit = isCount(num);
//		while(num!=0) {
//			int rem = num%10;
//			sum = sum + isPower(rem, digit);
//			num = num/10;
//		}
//		return sum == original;
//	}
//	public static void main(String[] args) {
//		int num = 1574;
//		if(isArmStrong(num)) {
//			System.out.println("ArmStrong Number");
//		}
//		else {
//			System.out.println("Not a ArmStrong Number");
//		}
//	}
//}

