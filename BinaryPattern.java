import java.util.Scanner;
public class BinaryPattern
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows:");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
       if(i%2==0)
{
	for(int j=1;j<=rows;j++)
	{
		if(j%2==0)
			System.out.print(1);
		else 
			System.out.print(0);
	}
}
else 
{
	for(int j=1;j<=rows;j++)
	{
		if(j%2==0)
			System.out.print(0);
		else 
			System.out.print(1);
	}
}
System.out.println();
}
}
}