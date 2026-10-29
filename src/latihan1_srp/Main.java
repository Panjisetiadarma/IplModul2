package latihan1_srp;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 2.2.1 LATIHAN 1: SINGLE RESPONSIBILITY PRINCIPLE (SRP) ===");
        Item item1 = new Item("Kopi Espresso", 18000.0);
        Item item2 = new Item("Roti Bakar Keju", 15000.0);

        Order order = new Order();
        order.addItem(item1);
        order.addItem(item2);

        OrderHistory history = new OrderHistory();
        history.getDailyHistory();

        OrderViewer viewer = new OrderViewer();
        viewer.printOrder(order);
    }
}
