//Find whether the given number is Armstrong number or not.
import java.util.Scanner;
public class fourteen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of digits in number");
		int k = scan.nextInt();
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int num1 = num;
		int sum = 0;
		for(int i = 0;i<k;i++)
		{
			int rem = num%10;
			sum = sum+(rem*rem*rem);
			num = num/10;
		}
		if(sum==num1)
			System.out.println("Entered number is an armstrong number");
		else
			System.out.println("Entered number is not an armstrong number");
	}

}
