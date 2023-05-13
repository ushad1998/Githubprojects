import java.util.Scanner;
class Largestsmallest
{
	public static void main(String[] args)
	{
		int arr[]={21,34,56,8,9,0,53,7};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<3;i++)
		{
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("Max value="+max);
		System.out.println("Min value="+min);
		System.out.println("Difference="+(max-min));

	}
}