
public class BookDetails {

	public static void main(String[] args) {
		Book b = new Book();
		EngineeringBook e = new EngineeringBook();
		b.setAuthor("Anagha C");
		b.setBookNo(1567);
		b.setPrice(300.08f);
		b.setTitle("Lords of Ramayana");
		b.print();
		e.setCategory("Mythological");
		e.print1();
		
		
		

	}

}
