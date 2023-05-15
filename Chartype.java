import java.util.Scanner;
public class Chartype{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int n=sc.nextInt();
		int a=64;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(a+j));
			}
			System.out.println();
		}
	}
}