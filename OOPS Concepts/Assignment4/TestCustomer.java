package Assignment4_oops;

public class TestCustomer {

	public static void main(String[] args) {
		
		Address a = new Address("1st Main HSR Layout","Banglore");
		Address a1 = new Address("1st Main Electronics City","Banglore");
		Customer c1 = new Customer();
		c1.setResidentialAddress(a);
		c1.setOfficialAddress(a1);
		Customer c = new Customer("John",c1.getResidentialAddress(),c1.getOfficialAddress());		
		c.getCustomerDetails();
}}
