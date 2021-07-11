import java.util.Scanner;

/*In a car racing video game, the car is an object. You can drive the car, turn the car, or stop the car when
needed but you need to drive long. You will get money according to the Km you have travelled. 
For example if you have travelled 123 km then the product of the km (ie 1*2*3 = 6) would be the amount you
win. Write a program to find the product of the digits in the given input number.

if the input number is negative or greater than 32767.print Invalid Input.
*/
public class five {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the distance you have travelled in kilometers");
		int num = scan.nextInt();
		if(num<0 || num>32767)
			System.out.println("Invalid input");
		else {
		int length = String.valueOf(num).length();
		int amount = 1;
		for(int i = 0;i<length;i++)
		{
			int r = num%10;
			amount = amount*r;
			num = num/10;			
		}
		System.out.println("The amount you won is: "+amount);}}}
