package programs;

public class EvenNumber {
	public static void main(String[] args) {
		int a = 10;
//		if(a%2 == 0) {
//			System.out.println("Event Number");
//		}
//		else {
//			System.out.println("Not a Even Number");
//		}
		for(int i=1;i<a;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}
}
