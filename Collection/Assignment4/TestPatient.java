package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestPatient {

	public static void main(String[] args) {
		
		Patient p1 = new Patient(101,"Nagarjuna",53);
		Patient p2 = new Patient(102,"Prabhas",34);
		Patient p3 = new Patient(103,"Ram Charan",41);
		
		List<Patient> patient = new ArrayList<>();
		patient.add(p1);
		patient.add(p2);
		patient.add(p3);
		
		/*TreeSet<Patient> pat = new TreeSet<>();
		
		pat.add(p1);
		pat.add(p2);
		pat.add(p3);*/
		
		Collections.sort(patient,new PatientComparator());
		
		for(Patient pati:patient) {
			System.out.println(pati);
			

		}
		
		
		

	}

}
