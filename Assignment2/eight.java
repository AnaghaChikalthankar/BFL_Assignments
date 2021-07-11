/*First line corresponds to n, the size of the array. The next n lines correspond to the elements of the first
array. The next n lines correspond to the elements in the second array. Output corresponds to the
consolidated feedback score.
1) Print "Invalid array size" when size of the array is a negative number and terminate the program
2) Print "Invalid input" when there is any negative number available in the input array and terminate the
program
Sample Input 1:
8
1
90
2
75
3
92
5
85
1
80
2
85
3
80
4
85
Sample Output 1:
1
90
2
85
3
92
5
85
4
85

*/
import java.util.Scanner;
public class eight {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean b = false,c = false,d = false;
		int arr3[] = new int[20];
		System.out.println("Enter number of elements in array");
		int num = scan.nextInt();
		
		if (num<0) {b = true; }
		if(b==true) {System.out.println("Invalid array size");}
		
		else {
			System.out.println("Enter elements in array1");
			int arr1[] = new int[20];
			for(int i = 0;i<num;i++) 
				{arr1[i] = scan.nextInt();
				if (arr1[i]<0)
					c = true;
				}
			
			System.out.println("Enter elements in array2");
			int arr2[] = new int[20];
			for(int i = 0;i<num;i++) 
				{arr2[i] = scan.nextInt();
				if (arr2[i]<0)
					d = true;
				}
							
				if(c==true || d == true) {System.out.println("Invalid input");}
				else {
					
					for(int i = 0;i<num;i++) 
						if(i%2==0 && arr1[i]==arr2[i]){
							arr3[i] = arr1[i];
							if(arr1[i+1]>arr2[i+1]) {arr3[i+1] = arr1[i+1];}
							else {arr3[i+1] = arr2[i+1];}}
					for(int i = 0;i<num+2;i++) {
						 if(i%2==0 && arr1[i]!=arr2[i]) {
							arr3[i] = arr1[i];
							arr3[i+1] = arr1[i+1];
							arr3[i+2] = arr2[i];
							arr3[i+3] = arr2[i+1];
						}}
			System.out.println("Consolidated array is: ");
			for( int i = 0;i<num+2;i++) 
			System.out.println(arr3[i]);}}
		}}
