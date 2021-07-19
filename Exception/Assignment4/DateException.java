package Assignment4_Exception;

public class DateException extends Exception{

  public  DateException() {
	  super("Date of Birth Should be in DD/MM/YYYY format ");
  }
}