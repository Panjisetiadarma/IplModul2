package latihan1_srp;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item ditambahkan: " + item.getName() + " (Rp " + item.getPrice() + ")");
    }

    public void deleteItem(Item item) {
        items.remove(item);
        System.out.println("Item dihapus: " + item.getName());
    }

    public List<Item> getItems() {
        return items;
    }

    public int getItemCount() {
        return items.size();
    }

    public double calculateTotalSum() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
