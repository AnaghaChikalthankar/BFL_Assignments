package Collection;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patient>  {

	@Override
	/*public int compare(Patient o1, Patient o2) {		
		return o1.getName().compareTo(o2.getName());
	}*/
	
	public int compare(Patient p1, Patient p2) {		
		return p1.getAge()-p2.getAge();
	}



}
