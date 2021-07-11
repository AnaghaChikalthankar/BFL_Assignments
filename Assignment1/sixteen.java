//.Write a program to find the sum of three numbers using interactive user.
import java.util.Scanner;
public class sixteen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = scan.nextInt();
		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		System.out.println("Enter third number");
		int num3 = scan.nextInt();
		int sum = 0;
		sum = num1+num2+num3;
		System.out.println("The sum of "+num1+","+num2+" and "+num3+" is "+sum);
		
	}

}
