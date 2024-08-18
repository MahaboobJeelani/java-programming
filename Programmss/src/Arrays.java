//import java.util.Scanner;
//public class Arrays {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the input:");
//		int size = sc.nextInt();
//		int []arr = new int[size];
//		//Taking the input from the user
//		for(int i=0;i<arr.length;i++) {
//			arr[i]= sc.nextInt();
//		}
//		//printing the output
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		sc.close();
//	}
//}


//    //WAJP to get the sum of array

//public class Arrays {
//	public static void main(String[] args) {
//		int sum = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Number:");
//		int size = sc.nextInt();
//		int []arr = new int[size];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//		}
//		for(int i=0;i<arr.length;i++) {
//			sum = sum + arr[i];
//		}
//		System.out.println(sum);
//	}
//}

//      //WAJP to Print largest number program in the array
//public class Arrays {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the Number:");
//		int size = sc.nextInt();
//		int []arr = new int[size];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
//		int max = 0;
//		for(int i=0;i<arr.length;i++) {
//			if(max<arr[i]) {
//				max = arr[i];
//			}
//		}
//		System.out.println(max);
//	}
//}

//    //if i enter the value which is present in arr, the output is index Number
//public class Arrays {
//	public static void main(String[] args) {
//	    int key = 5, pos =-1;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Number");
//		int size = sc.nextInt();
//		int []arr = new int[size];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]= sc.nextInt();
//		}
//		for(int i=0;i<arr.length;i++) {
//			if(key == arr[i]) {
//				pos = i;
//				break;
//			}
//		}
//		System.out.println(pos);
//		
//	}
//}
