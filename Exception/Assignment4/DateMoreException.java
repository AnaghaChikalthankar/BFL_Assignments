package Assignment4_Exception;

public class DateMoreException extends Exception {

   public DateMoreException() {
	   super("The Date of Birth can not be after current date.");
   }
}
