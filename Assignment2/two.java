/*John is working as a clerk in an organization where N number of people are working. His boss has asked
him to get the count of employees who get same salary. Help him to get the count of repeated salary.

If the size of the array is negative or if any of the array elements are negative, print “Invalid Input” and
terminate the program.
*/
import java.util.Scanner;
public class two {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of elements in array");
		boolean b = false,c = false;
		int num = scan.nextInt();
		if(num<0)
			b = true;
		if (b == true)
			System.out.println("Invalid array size");
		else {
			System.out.println("Enter elements in array");
			int sal[] = new int[20];
			int count = 0,i;
			
			for(i = 0;i<num;i++)
				{sal[i] = scan.nextInt();
				if(sal[i]<0)
					c = true;				
				}
			if (c == true)
				System.out.println("Invalid Input");
			else {
						
				for(i = 0;i<num;i++)
				if(sal[1]==sal[i])
					count++;
			System.out.println("The count of repeated salary is: "+count);}			
		}}}
