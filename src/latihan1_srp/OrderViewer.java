package latihan1_srp;

public class OrderViewer {
    public void printOrder(Order order) {
        System.out.println("[OrderViewer] Mencetak struk pesanan kasir POS:");
        System.out.println("----------------------------------------------");
        for (Item item : order.getItems()) {
            System.out.println("- " + item.getName() + "\t: Rp " + item.getPrice());
        }
        System.out.println("Total Pembayaran\t: Rp " + order.calculateTotalSum());
        System.out.println("Jumlah Item\t\t: " + order.getItemCount() + " item");
        System.out.println("----------------------------------------------");
    }

    public void showOrder(Order order) {
        System.out.println("[OrderViewer] Menampilkan ringkasan pesanan di layar monitor kasir.");
    }
}
