
public class Product {
	
	private int code;
	private String name;
	private int price;
	private String catg;
	
	public Product(int code, String name, int price, String catg) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.catg = catg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCatg() {
		return catg;
	}
	public void setCatg(String catg) {
		this.catg = catg;
	}
	
	public String toString()
	{
		return code+"-"+name+"-"+price+"-"+catg;
	}	

}
