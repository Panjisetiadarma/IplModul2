package latihan3_lsp;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 2.2.3 LATIHAN 3: LISKOV SUBSTITUTION PRINCIPLE (LSP) ===");
        Product vegetable = new Vegetable();
        Product smartphone = new Smartphone();

        vegetable.getProductInfo();
        System.out.println();
        smartphone.getProductInfo();
    }
}
