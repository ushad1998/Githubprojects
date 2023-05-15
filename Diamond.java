import java.util.Scanner;
public class Diamond
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter num of rows");
	int n=sc.nextInt();
	int space=n-1;
	int i,j;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		space--;
		for(j=1;j<=(2*i-1);j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

		space=1;
		for(i=1;i<=n-1;i++)
		{
			for(j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space++;
			for(j=1;j<=2*(n-i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}