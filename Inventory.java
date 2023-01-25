import java.util.ArrayList;

public class Inventory {
	private ArrayList<Item> inStock;

	public Inventory() {
		inStock = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		inStock.add(item);
	}

	public void removeItem(String name) {
		for (int i = inStock.size()-1; i >= 0; i--) {
			if (inStock.get(i).getName().equals(name)) {
				inStock.remove(i);
			}
		}
	}
	
	public void removeItem() {
		for (int i = inStock.size()-1; i >= 0; i--) {
			if (inStock.get(i).getQuantity() == 0) {
				inStock.remove(i);
			}
		}
	}

	public void updatePrice(String name, double percentChange) {
		for (int i = inStock.size()-1; i >= 0; i--) {
			if (inStock.get(i).getName().equals(name)) {
				inStock.get(i).setQuantity(inStock.get(i).getPrice() * percentChange); 
			}
		}
	}
	public int largestQuantityIndex() {
		int highest = 0;
		int counter = 0;
		int index = 0;
		for (Item n : inStock) {
			if (n.getQuantity() > highest) {
				highest = n.getQuantity();
				index = counter;
			}
			counter++;
		}
		return index;
	}
	
	public ArrayList<Item> getInventoryList() {
		return inStock;
	}
}
