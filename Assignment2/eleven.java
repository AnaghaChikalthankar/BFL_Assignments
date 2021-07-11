//Check whether given number is a power of 2 or not .If yes Print 'Yes' else 'No'
//Print "Number too small" if the number is less than 0
//Print "Number too large" if the number is greater than 32767
import java.util.Scanner;
public class eleven {
	public static void main(String[] args)   {
		 Scanner scan = new Scanner(System.in);						
		 System.out.println("Enter the number");
		 int num = scan.nextInt();
		 int i = 0;
		 boolean b = false;
		 if(num<0)
			 System.out.println("Number too small");
		 else if(num>32767)
			 System.out.println("Number too large");
		 else
		 {
			 for(i = 0;i<15;i++)
			 {
				 if(num== Math.pow(2, i))
					 b = true;
			 }
			 if(b==true)
				 System.out.println("Yes");
			 else
				 System.out.println("No");				 
		 }}}
