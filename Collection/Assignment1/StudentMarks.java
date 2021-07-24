package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of students");
		int n = scan.nextInt();
		System.out.println("Enter marks of students");
		ArrayList<Integer> marks = new ArrayList<>();
		double sum = 0;
		for (int i = 0; i < n; i++) {
			marks.add(scan.nextInt());
		}
		Collections.sort(marks);
		for (int i = 0; i < n; i++) { sum = sum+marks.get(i);}
		System.out.println("Highest marks : "+marks.get(n-1) );
		System.out.println("Average marks : "+sum/n );
		System.out.println("Marks Scored by 3rd student : "+marks.get(n-3) );
		
		Iterator i = marks.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}}
