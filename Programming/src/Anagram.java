//public class Anagram {
//	public static String Sort(char[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					char temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		return new String(arr);
//	}
//
//	public static void main(String[] args) {
//		String s1 = "Hello";
//		String s2 = "leolH";
//		char[] arr1 = s1.toCharArray();
//		char[] arr2 = s2.toCharArray();
//		String ans1 = Sort(arr1);
//		String ans2 = Sort(arr2);
//		if (ans1.equals(ans2)) {
//			System.out.println("Anagram");
//		} else {
//			System.out.println("Not a Anagram");
//		}
//
//	}
//}

//public class Anagram {
//	static String Sort(char[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = arr[i];
//				}
//			}
//		}
//		return new String(arr);
//	}
//
//	public static void main(String[] args) {
//		String s1 = "Hello";
//		String s2 = "loelh";
//		char[] arr1 = s1.toCharArray();
//		char[] arr2 = s2.toCharArray();
//		String ans1 = Sort(arr1);
//		String ans2 = Sort(arr2);
//		if (ans1.equals(ans2)) {
//			System.out.println("Anagram");
//		} else {
//			System.out.println("Not a Anagram");
//		}
//	}
//
//}