
public class Item {
	private String name;
	private double price;
	private int quantity;
	
	public Item(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity; 
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void updateQuantity(int quant) {
		quantity = quant;
	}
	
	public void setQuantity(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "\nName: " + name + ", Quantity: " + quantity + ", Price: " + price;
	}
}
