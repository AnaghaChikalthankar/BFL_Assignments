/*. The available denominations of rupees or coins is 500, 100, 50, 10, 5 and 1. 
 * write a program to find the minimal number of coins or notes to be given to his kid?
Input and Output Format:
Input consists of a single integer that corresponds to the fee amount to be paid.
Output consists of an integer that corresponds to the minimal number of coins or rupee notes.
Print Invalid Input if the input value is negative.*/
import java.util.Scanner;
public class four {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount of fees");		
		int fee = scan.nextInt();
		if(fee >0) {
		int[] notes = new int[]{500,100,50,10,5,1};
		int counter[] = new int[9];
		int sum =0;
		for(int i = 0;i<6;i++)
		{
			if(fee>=notes[i]) {
				counter[i] = fee/notes[i];
				fee = fee-(counter[i]*notes[i]);}
			sum = sum+counter[i];}
		System.out.println("The minimum number of coins or rupee notes- required for given number is: "+sum);}
		else {System.out.println("Invalid Input");}}}
