/*Create a new Class Customer
Create following data members - custId and custName and custCity
Add new method print() to print the details of customers.
Add setters and getters for each data members.
Create 2 objects of the class and invoke all setters and getters methods and print
method.
*/
public class Customer {
	private int custId;
	private String custName;
	private String custCity;
	
	public void print1() {
		System.out.println(custId+"--"+custName+"--"+custCity);}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustCity() {
		return custCity;
	}

	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setCustId(100);
		c.setCustName("Kartiki");
		c.setCustCity("Kolhapur");
		c.print1();
		System.out.println(c.getCustId());
		System.out.println(c.getCustName());
		System.out.println(c.getCustCity());}}

