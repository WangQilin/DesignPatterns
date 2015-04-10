package builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.getPrice();
		}
		return cost;
	}

	public void showItems() {
		for (Item item : items) {
			System.out.println("Item : " + item.getName());
			System.out.println("Packing : " + item.getPacking().getPack());
			System.out.println("Price : $" + item.getPrice());
		}
	}
}
