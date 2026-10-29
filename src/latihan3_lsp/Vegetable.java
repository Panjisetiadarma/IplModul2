package latihan3_lsp;

import java.util.Date;

public class Vegetable extends FoodProduct {
    @Override
    public String getName() {
        return "Broccoli";
    }

    @Override
    public Date getExpiredDate() {
        return new Date(System.currentTimeMillis() + (7L * 24 * 60 * 60 * 1000));
    }
}
