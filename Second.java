import java.util.Arrays;
import java.util.Scanner;
class Second
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int no,temp;
		System.out.println("Enter no. of elements you want in array");
		no=in.nextInt();
		int arr[]=new int[no];
		System.out.println("Enter "+no+" elements");
		for(int i=0;i<no;i++)
			arr[i]=in.nextInt();
		for(int i=0;i<no;i++)
		{
			for(int j=i+1;j<no;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;

				}
			}
		}
		System.out.println("Second largest value="+arr[no-2]);
		System.out.println("Second smallest value="+arr[1]);
	}
}