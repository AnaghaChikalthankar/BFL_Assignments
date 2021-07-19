package Assignment3;

public abstract class PrepaidCard {
	int CardNo;
	double availableBalance;
	double swipeLimit;
	boolean b = false;
	public PrepaidCard(int cardNo, double availableBalance, double swipeLimit) {
		super();
		CardNo = cardNo;
		this.availableBalance = availableBalance;
		this.swipeLimit = swipeLimit;
	}

	
	public abstract boolean swipecard(double amount);
	public void rechargeCard(double amount) {
		availableBalance = availableBalance+amount;
}}
	interface Rewardable{
		public abstract void method();
	}
	class TravelCard extends PrepaidCard implements Rewardable{
	int rewardPoints;
	double amount;
	public TravelCard(int cardNo, double availableBalance, double swipeLimit) {
		super(cardNo, availableBalance, swipeLimit);
		// TODO Auto-generated constructor stub
	}
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean swipecard() {
		return false;
	}

	@Override
	public void method() {
		double availableBalance1;
		double INR = amount*74.57;
		availableBalance1 = availableBalance- INR -(0.05*INR);
		
		rewardPoints = (int) (INR/20);
		
		System.out.println("CardNo :"+CardNo+"\navailable Balance : "+availableBalance+"\nAmount : "+amount+"\nAmount in Rs : "+INR+"\navailable Balance after deduction : "+availableBalance1+
				"\nswipeLimit : "+swipeLimit+"\nrewaedPoints are : "+rewardPoints);
			
	}
	@Override
	public boolean swipecard(double amount) {
		return false;
	}}
