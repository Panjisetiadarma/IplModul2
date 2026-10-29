package tugas3_ocp_mahasiswa;

public class DeluxeCinema extends Cinema {
    public DeluxeCinema(Double price) {
        super(price);
    }

    @Override
    public Double calculateAdminFee() {
        return price * 12 / 100;
    }
}
