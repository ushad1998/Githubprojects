import java.util.Scanner;
class ReverseString
{
	public static void main(String[] args)
	{
		String str;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any string");
		str=in.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
}