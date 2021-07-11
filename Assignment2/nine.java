/*Given an Integer array. Find the average of the numbers located on the Prime Indexes of the Array.
Consider 0 index as 1 and 1 index is 2 and so on……
1) Print "Invalid array size" when size of the array is a negative number.
2) Print "Invalid input" when there is any negative numbers available in the input array.
*/
import java.util.Scanner;
public class nine {

	public static void main (String[] args)
	   {		
	       int i =0;
	       double sum = 0,count1 = 0;
	       boolean b = false,c =false;
	       Scanner scan = new Scanner(System.in);						
			System.out.println("Enter number of elements in array");
			int num = scan.nextInt();
			if(num<0)
				b = true;
			if(b==true)
				System.out.println("Invalid array size");
			else {
				
				System.out.println("Enter elements in array1");
				int arr[] = new int[20];
				for (i = 1; i <= num; i++) 
				{
					arr[i] = scan.nextInt();
					 if(arr[i]<0)
							c= true;
					}
				if(c==true)
					System.out.println("Invalid input");
				else {	
						
				
		       for (i = 1; i <= num; i++)         
		       { 
		    	  
					int counter=0; 
		          for(int j =i; j>=1; j--)
			  {
		             if(i%j==0)
			     {
		 		counter = counter + 1;
			     }
			  }
			  if (counter ==2)
			  {
			    sum = sum+arr[i];
			    count1++;
			  }	
		       }	
		       System.out.printf("Average of numbers at prime index is:%.2f",sum/count1);
		       
		   }}}}
	


	


