package programs;

import java.util.Scanner;

public class ValuesStartingpointandEndingPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Point");
		int sp = sc.nextInt();
		System.out.println("Enter the ending pointing");
		int ep = sc.nextInt();
		int sum = 0;
		for(int i=sp; i<ep;i++) {
			if(i%2==0) {
				sum = sum + i;
//				System.out.println(i);
			}
		}
		System.out.println(sum);
	}
}
