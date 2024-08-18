package programs;

public class Factorial {
	public static void main(String[] args) {
		int n = 3, fac = 1;
		for(int i=1;i<n;i++) {
			fac = fac *i;
		}
		System.out.println(fac);
	}
}
