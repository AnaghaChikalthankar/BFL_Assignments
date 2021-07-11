/*Karen got salary for this month and she spends 20% of her salary for food and 30% of her salary for travel.
If she takes care of other shifts she will get 2% of the salary per day. Given her salary and the number of
shifts she handled. Calculate how much she can save in her pocket after spending all these?
Input and Output Format :

First line of input consists of an integer, salary. Next line correspond to the number of shifts. Output
consist of an integer, which is saving.

1) Print "Salary too large" when salary is greater than 8000.
2) Print "Shifts too small" when the shift is less than 0.
3) Print "Salary too small" when the salary is less than 0.*/
import java.util.Scanner;
public class one {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the salary");
		double sal = scan.nextInt();
		if(sal<=8000 && sal>0)
		{
			System.out.println("Enter number of shifts");
			double shift = scan.nextInt();
			
			if (shift<0) {System.out.println("Shifts too small");}
			else {
			double savings;
			savings = sal +(shift*0.02*sal)-(0.5*sal);
			System.out.println("Karen can save "+savings+" after all spendings");
			}
		}
		
		else if(sal>8000) {System.out.println("Salary too large");}

		else if(sal<0) {System.out.println("Salary too small");}
		
						
		}
		}

