//9. Write a program to input a number and find the sum of its digits.
import java.util.Scanner;
public class nine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int sum = 0;
		int length = String.valueOf(num).length();
		for(int i = 0;i<length;i++)
		{
			int r = num%10;
			sum = sum+r;
			num = num/10;
		
		}
		System.out.println("Sum of digitis of number is "+sum);		
	}
}
