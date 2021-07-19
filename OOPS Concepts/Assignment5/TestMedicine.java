package Assignment5;

public class TestMedicine {

	public static void main(String[] args) {
		
		
		int Medicine[] = new int[4]; 
		double i = Math.random()*4;
		int x = (int)i;
		System.out.println(x);
				
		Medicine t = new Tablet(450,2022);
		Medicine s = new Syrup(120,2025);
		Medicine o = new Ointment(340,2024);
		
		if(x==1) {
			t.getDetails();
			t.displayLabel();
		}
					
		else if(x==2) {
			s.getDetails();
			s.displayLabel();
			
		}
		else if(x==3) {
			o.getDetails();
			o.displayLabel();
			
		}

	}

}
