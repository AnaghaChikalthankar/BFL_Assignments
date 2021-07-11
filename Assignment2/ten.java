//Write a program to find the number of times a particular number occurs in a given input array
import java.util.Scanner;
public class ten {
	public static void main (String[] args)
		   {		
		       int i =0,count = 0;
		       boolean b = false,c =false;
		       Scanner scan = new Scanner(System.in);						
				System.out.println("Enter number of elements in array");
				int num = scan.nextInt();
				if(num<0)
					b = true;
				if(b==true)
					System.out.println("Invalid array size");
				else {					
					System.out.println("Enter elements in array");
					int arr[] = new int[20];
					for (i = 0; i <num; i++) 
					{
						arr[i] = scan.nextInt();
						 if(arr[i]<0)
								c= true;
						}
					if(c==true)
						System.out.println("Invalid input");
					else {
						System.out.println("Enter the element whose count needs to be found");
						int num1 = scan.nextInt();
						for (i = 0; i <num; i++) {
							if(arr[i]==num1)
								count++;
						}
						System.out.println("The count of "+num1+" in given array is "+count);
}
}}}
