//write a program to accept a number from the command line and check if it is a prime number.
import java.util.Scanner;
public class seventeen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		if(num==1)
			System.out.println("1 is neither prime nor a composite number");
		else {
		boolean b = false;
		for(int i = 2;i<=num-1;i++)
		{
			if(num%i == 0)
			b = true;
		}
		if(b)
			System.out.println("Entered number is not a prime number");
		
		else
			System.out.println("Entered number is a prime number");
	}}

}
