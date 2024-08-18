package programs;

public class EvensunOddsum {
	public static void main(String[] args) {
		int esum = 0, osum =0;
		int n = 23;
		for(int i=0; i<n; i++) {
			if(i%2==0) {
				esum = esum+i;
			}
			else {
				osum = osum + i;
			}
		}
		System.out.println("Esum "+esum);
		System.out.println("Osum "+osum);
	}

}
