package latihan2_ocp;

public class StandardCinema extends Cinema {
    public StandardCinema(Double price) {
        super(price);
    }

    @Override
    public Double calculateAdminFee() {
        return price * 10 / 100;
    }
}
