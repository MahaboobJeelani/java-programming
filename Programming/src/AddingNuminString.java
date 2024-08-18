import java.util.Scanner;

public class AddingNuminString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		String s = sc.next();
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {
				ans = ans + (c-48);
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
