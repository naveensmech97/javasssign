
public class House {

	public static void main(String[] args) {
		
		int n=13;
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0 || i==n || j==n || j==0 || i+j<=n/2 || j-i>=n/2)
					
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
