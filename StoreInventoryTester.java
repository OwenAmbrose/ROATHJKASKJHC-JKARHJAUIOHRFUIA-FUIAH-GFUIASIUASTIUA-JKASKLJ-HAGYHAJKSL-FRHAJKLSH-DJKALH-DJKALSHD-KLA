public class StoreInventoryTester {

	public static void main(String[] args) {
		Inventory storeInventory = new Inventory();
		storeInventory.addItem(new Item("luffy", 10.0, 10));
		storeInventory.addItem(new Item("luffy", 10.0, 10));
		storeInventory.addItem(new Item("zoro", 30.0, 1));
		storeInventory.addItem(new Item("nami", 20.0, 7));
		storeInventory.addItem(new Item("usopp", 5.0, 4));
		storeInventory.addItem(new Item("sanji", 15.0, 3));
		storeInventory.addItem(new Item("chopper", 25.0, 2));
		storeInventory.addItem(new Item("robin", 0.0, 8));
		storeInventory.addItem(new Item("franky", 35.0, 12));
		storeInventory.addItem(new Item("brook", 50.0, 13));
		storeInventory.addItem(new Item("jimbei", 40.0, 0));
		System.out.println(storeInventory.getInventoryList());
		storeInventory.updatePrice("zoro", 1.5);
		System.out.println(storeInventory.getInventoryList());
		System.out.println(storeInventory.largestQuantityIndex());
		storeInventory.removeItem("luffy");
		System.out.println(storeInventory.getInventoryList());
		storeInventory.removeItem();
		System.out.println(storeInventory.getInventoryList());
	}

}
