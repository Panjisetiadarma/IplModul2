package latihan3_lsp;

import java.util.Date;

public abstract class FoodProduct extends Product {
    public abstract Date getExpiredDate();

    @Override
    public void getProductInfo() {
        super.getProductInfo();
        System.out.println("  -> Kategori: Produk Pangan (Memiliki Masa Kedaluwarsa)");
        System.out.println("  -> Expired Date: " + getExpiredDate());
    }
}
