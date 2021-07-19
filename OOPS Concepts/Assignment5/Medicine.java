package Assignment5;

public abstract class Medicine {
		int price;
		int expiryDate;
		public abstract void getDetails();
		abstract void displayLabel();
		public Medicine(int price, int expiryDate) {
			super();
			this.price = price;
			this.expiryDate = expiryDate;
		}

	}

class Tablet extends Medicine{

	public Tablet(int price, int expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getDetails() {
		System.out.println("Price : "+price+"\nExpiry Date : "+expiryDate);
	}

	@Override
	void displayLabel() {System.out.println("Store in cool and dry place");
	
	}
	
}
class Syrup extends Medicine{

	public Syrup(int price, int expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getDetails() {
		System.out.println("Price : "+price+"\nExpiry Date : "+expiryDate);
	}

	@Override
	void displayLabel(){
		System.out.println("Should not be consumed by child below 3 years");
	}}

class Ointment extends Medicine{

	public Ointment(int price, int expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getDetails() {
		System.out.println("Price : "+price+"\nExpiry Date : "+expiryDate);
	}

	@Override
	void displayLabel() {System.out.println("For external use only");}}


