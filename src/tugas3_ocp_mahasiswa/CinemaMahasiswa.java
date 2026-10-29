package tugas3_ocp_mahasiswa;

public class CinemaMahasiswa extends Cinema {
    public CinemaMahasiswa(Double price) {
        super(price);
    }

    @Override
    public Double calculateAdminFee() {
        // Biaya admin khusus mahasiswa 5% (5/100) sesuai prinsip OCP
        return price * 5 / 100;
    }
}
