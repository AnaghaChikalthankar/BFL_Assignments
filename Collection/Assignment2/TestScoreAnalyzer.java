package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class TestScoreAnalyzer {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of players");
		int n = scan.nextInt();
		System.out.println("Enter runs");
		
		ScoreAnalyzer sa = new ScoreAnalyzer();
		
		for(int i =0;i<n;i++) {
		sa.runsdata.add(scan.nextInt());}
		
		System.out.println("Runs Scored:");
		Iterator i = sa.runsdata.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("Runrate is : "+sa.CalculateRunRate());
		System.out.println(sa);
		System.out.println("Count of players is : "+n);

	
	}

}
