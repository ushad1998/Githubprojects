import java.util.Scanner;
public class NumPattern
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int n=sc.nextInt();
		for(int i=1;i<n;i++){
			for(int space=n-1;space>=i;space--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--)
			{
			System.out.print(k);
		}
		System.out.println();
		}
	}
}