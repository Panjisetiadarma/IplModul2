package latihan2_ocp;

public class PremiumCinema extends Cinema {
    public PremiumCinema(Double price) {
        super(price);
    }

    @Override
    public Double calculateAdminFee() {
        return price * 20 / 100;
    }
}
