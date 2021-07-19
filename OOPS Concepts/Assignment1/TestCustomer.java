
/*Create a class TestCustomer with a main method
 * Create an object of Customer with default constructor. 
 * Use setters to assign values to the member variables. 
 * Display the values of member variables using getters.
 * Create an object of Customer using parameterized constructor and display all thedetails of the customer
 *  using getCustomerDetails method*/
public class TestCustomer {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setCustomerName("John");
		Address a = new Address("1st Main HSR Layout","Banglore");
		c.setResidentialAddress(a);
		Customer c1 = new Customer("john",c.getResidentialAddress());
		c.getCustomerDetails();
		
		
	

	}

}

