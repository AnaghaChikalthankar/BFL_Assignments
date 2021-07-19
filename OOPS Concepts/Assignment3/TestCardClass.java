package Assignment3;

public class TestCardClass {

	public static void main(String[] args) {		
		TravelCard t = new TravelCard(1234,50000.00,5000);
		t.setAmount(500);
		t.method();		
	}

}
/*package Assignment3_Exception;
import java.time.LocalDate; 
import java.time.format.DateTimeFormatter; 
public class AgeCalculator1  {	
 public static void main(String[] args) {
	 
    LocalDate myObj = LocalDate.now(); 
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String formattedDate = myObj.format(myFormatObj);
    System.out.println(formattedDate);

  }
}*/
