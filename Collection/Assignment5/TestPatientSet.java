package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestPatientSet {

	public static void main(String[] args) {
		Patient p1 = new Patient(101,"Nagarjuna",53);
		Patient p2 = new Patient(102,"Prabhas",34);
		Patient p3 = new Patient(101,"Nagarjuna",53);
	
		LinkedHashSet<Patient> patient = new LinkedHashSet();
		patient.add(p1);
		patient.add(p2);
		patient.add(p3);
		
		System.out.println(patient.size());
		Iterator i = patient.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());	
		}
	
	}
}	
	
	


