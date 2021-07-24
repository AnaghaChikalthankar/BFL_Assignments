package Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ScoreAnalyzer {
	
	List runsdata = new LinkedList();
	public ScoreAnalyzer() {}
	public ScoreAnalyzer(List runsdata) {
		super();
		this.runsdata = runsdata;
	}
     public double CalculateRunRate() {
    	 double runrate = 0;
	
    	 Iterator i = runsdata.iterator();
 		while(i.hasNext()) {
 			int a = (int) i.next();
 		
 		runrate = runrate+a;
 		}
 		return runrate/50;
 		
	}
	public String toString() {
		Collections.sort(runsdata);
		return "Lowest runs scored are : "+ runsdata.get(0);
		
	}
}


