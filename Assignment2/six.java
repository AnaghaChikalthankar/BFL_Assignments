/*Given an input array first Index indicates the cricketer’s id and second index indicates the score and so
on……
Find out the cricketer's id who scored more than given score
Input and Output Format :
First line of input consists of n, the number of elements. Next n lines correspond to the array elements.The
next line of the input consists of an integer that corresponds to the given score.
Output consist of an integer array, which contains cricketer's id who have scored more than the given score.
*/
import java.util.Scanner;
public class six {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements in array");
		int num = scan.nextInt();
		boolean b = false,c = false;
		if(num<0)
			b= true;
		if(b==true){System.out.println("Invalid array size");}
		else {
		System.out.println("Enter cricketer’s id at first index and score at second index...");	
		int arr[] = new int[20];
		for(int i = 0;i<num;i++) {
			arr[i] = scan.nextInt();
			if(arr[i]<0)
				c = true;}
		if(c==true){System.out.println("Invalid input");}
		else {
		System.out.println("Enter the score");
		int score = scan.nextInt();
		if(score>0) {
			System.out.println("The cricketer’s id with score more than given are: ");
			for(int i = 0;i<num;i++) {
				if(i%2!=0 && arr[i]>score) {
					System.out.println(arr[i-1]);}}}
		else {System.out.println("invalid score");}}}}}
