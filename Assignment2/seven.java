/*Write a program to convert given temperature from Fahrenheit to Centigrade.
Formula:
C = (F-32)/1.8
If the input is a negative number, print Invalid Input and terminate the program.
Input and Output Format:
Input consists of a single integer.
Output consists of a floating point number that corresponds to the centigrade equivalent. The output is
displayed correct to 2 decimal places.*/
import java.util.Scanner;
public class seven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit");
		double f = scan.nextDouble();
		if(f<0)
			System.out.println("Invalid Input");
		else {
		double c;
		c = (f-32)/1.8;
		System.out.printf("Value of temperature in centigrade is: %.2f",c);
		}}}