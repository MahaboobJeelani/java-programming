package programs;

public class Demo1 {

	public static void main(String[] args) {
		int n=5;
		int i;
		int j;
		for( i=1;i<=n;i++)
		{
			for(j=1;j<=2*n-1;j++)
			{
				if(j<=i || j>=n*2-i)
				{
					System.out.print("*");
				}
			
			System.out.print("  ");
			}
		
		System.out.println();
		}
	}

}
