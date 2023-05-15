import java.util.Scanner;
 class TemperatureConverter
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter temperature in farenheit = ");
	double F=sc.nextDouble();
	double C=5.0/9*(F-32);
	System.out.println("Temperature in Farenheit ="+F);
	System.out.println("Temperature in celcius ="+C);
}
}