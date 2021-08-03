import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Ticket {
	private int counter = 100;
	private String pnr;
	private LocalDate travelDate;
	private Train train;
	private TreeMap<Passenger,Double> passengers=new TreeMap<Passenger,Double>(new Comparator<Passenger>() {

		 

        @Override
        public int compare(Passenger o1, Passenger o2) {
            return o1.getName().compareTo(o2.getName());
        }
        
    });;
	private int y,m,d,num;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public LocalDate getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}
	public Train getTrain() {
		return train;
	}
	public void setTrain(Train train) {
		this.train = train;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	traindata td = new traindata();
	public String generatePNR() {
		
		char one  = td.getSource().charAt(0);
		char two = td.getDestination().charAt(0);
		
		return ""+one+two+"_"+y+m+d+"_"+counter;
	}
	int page;
	char pgen;
	String pnam;
	
	public String getPnam() {
		return pnam;
	}
	public void setPnam(String pnam) {
		this.pnam = pnam;
	}
	public double calcPassengerFare(Passenger p) {
		double price = 0;
		
		
		if(page>=60) {
			price = traindata.getTicketPrice()*0.6;}
		else if(page<=12) {
			price = traindata.getTicketPrice()*0.5;}
		else if (pgen=='f') {
			price = traindata.getTicketPrice()*0.75;
		}
	    else {price = traindata.getTicketPrice();}
		return price;
		
		
		
		}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public char getPgen() {
		return pgen;
	}
	public void setPgen(char pgen) {
		this.pgen = pgen;
	}
	
	public void addPassenger(String name, int age, char i) {
		
		Passenger newPassenger=new Passenger(name,age,i);
		passengers.put(newPassenger,calcPassengerFare(newPassenger));
		
		/*Set<Passenger> keys = passengers.keySet();
		for(Passenger key:keys) {
			System.out.println(key+"\t"+passengers.get(key));
		}*/
}
	
	public double calculateTotalTicketPrice() {
		double totalfare=0;
		for(Map.Entry<Passenger, Double> entry:passengers.entrySet()) {
			totalfare=totalfare+entry.getValue();
		}
		return totalfare;
	}
	
	public StringBuilder generateTicket() {
		StringBuilder sb=new StringBuilder();
		
		sb.append("\nPNR:"+generatePNR());
		sb.append("\nTrain No:"+td.getTrainNo());
		sb.append("\nTrain Name:"+td.getTrainName());
		sb.append("\nFrom:"+td.getSource());
		sb.append("\nTo:"+td.getDestination());
		sb.append("\nTravel Date : "+ d+"/"+m+"/"+y);	
		sb.append("\n");
		sb.append("\nPassengers:");
		sb.append("\nname\t"+"age\t"+"Gender\t"+"Fare\n");
		for(Map.Entry<Passenger, Double> entry:passengers.entrySet()) {
			sb.append(entry.getKey().getName()+"\t"+entry.getKey().getAge()+"\t"+entry.getKey().getGender()+"\t"+entry.getValue()+"\n");
		}
		sb.append("\nTotal Price:"+this.calculateTotalTicketPrice());
		return sb;
		}
	Set<Passenger> keys = passengers.keySet();
	public  void getTicket() throws IOException {
		
		String pnr = generatePNR();
		String pnr1 = "\nPNR : "+generatePNR();
		String tno = "\nTrain No : "+td.getTrainNo();
		String tname = "\nTrain Name : "+td.getTrainName();
		String from = "\nFrom: "+td.getSource();
		String to = "\nTo : "+td.getDestination();
		String date = "\nTravel Date : "+ d+"/"+m+"/"+y;
		String pan = "\n\nPassengers : ";
		String pan1 = "\nName"+"\t"+"Age"+"\t"+"Gender"+"\t"+"Fare";
		String tic = "\nTotal price : "+calculateTotalTicketPrice();
		String s = "\n================================================";
		FileOutputStream fos = new FileOutputStream(pnr);
        fos.write(s.getBytes());
        fos.write(pnr1.getBytes());
        fos.write(tno.getBytes());
        fos.write(tname.getBytes());
        fos.write(from.getBytes());
        fos.write(to.getBytes());
        fos.write(date.getBytes());
        fos.write(pan.getBytes());
        fos.write(pan1.getBytes());
        for(Passenger key:keys) {
  			String n1 =  "\n"+key+"\t"+passengers.get(key);
  			fos.write(n1.getBytes());
  		}
        fos.write(tic.getBytes()); 
        fos.write(s.getBytes());
        fos.close();
	}
	
}
	
	











