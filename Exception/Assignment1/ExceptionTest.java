package Assignment1_Exception;
import java.util.Scanner;
public class ExceptionTest {
	public static void main(String[] args) {
		try {
			try {
			int a = Integer. parseInt(args[0]);
			int b = Integer. parseInt(args[1]);
			
			try {
				int c = a/b;
				System.out.println(a+"/"+b+" is : "+c);		
			}
			catch(ArithmeticException e)
			{
				System.out.println("Division by zero is not possible");
				e.printStackTrace();			
			}	
			}
			catch(NumberFormatException e)
			{
				System.out.println("Only integers are allowed");
				e.printStackTrace();			
			}}
		catch(Exception e) {
			System.out.println("No input received");
			e.printStackTrace();
}}}
