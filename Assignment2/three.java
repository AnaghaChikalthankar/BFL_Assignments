/*Given an Integer array, find out sum of Even and odd Numbers individually and find the maximum.
Input and Output Format :

First line of input consists of n, the number of elements. Next n lines correspond to the array elements.

Output consist of maximum of odd and even sum.
1) Print "Invalid array size" when size of the array is a negative number and terminate the program.
2) Print "Invalid input" when there is any negative numbers available in the input array and terminate the
program.*/
import java.util.Scanner;
public class three {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int num = scan.nextInt();
		boolean b = false;
		boolean c = false;
		int sum1 = 0,sum2 = 0;
		if(num<0) 
			b = true;		
		if(b==true) {System.out.println("Invalid array size");}
		else {
		System.out.println("Enter elements in array");
		int arr[] = new int[20];
		for(int i = 0;i<num;i++) 
		{
			arr[i] = scan.nextInt();
			if(arr[i]<0)
				c = true; }		
		if (c==true){System.out.println("Invalid input");}
		else {
			for(int i = 0;i<num;i++) 
			{
				if(arr[i]%2 == 0) {sum1 = sum1 +arr[i];}
				else {sum2 = sum2+arr[i];}
			}
			if(sum1>sum2)
			{System.out.println(sum1);}
			else
			{System.out.println(sum2);}}}}}
