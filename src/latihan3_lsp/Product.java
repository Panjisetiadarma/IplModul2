package latihan3_lsp;

public abstract class Product {
    public abstract String getName();

    public void getProductInfo() {
        System.out.println("[Product Info] Nama Produk: " + getName());
    }
}
