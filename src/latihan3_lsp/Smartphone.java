package latihan3_lsp;

public class Smartphone extends Product {
    @Override
    public String getName() {
        return "Samsung S10+ Limited Edition";
    }

    @Override
    public void getProductInfo() {
        super.getProductInfo();
        System.out.println("  -> Kategori: Perangkat Elektronik (Tidak Memerlukan Expired Date)");
    }
}
