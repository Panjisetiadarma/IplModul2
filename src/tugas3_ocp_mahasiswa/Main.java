package tugas3_ocp_mahasiswa;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 2.3 TUGAS 3: PENERAPAN OCP PADA CLASS CINEMAMAHASISWA ===");
        Cinema standardCinema = new StandardCinema(100.0);
        Cinema deluxeCinema = new DeluxeCinema(100.0);
        Cinema premiumCinema = new PremiumCinema(100.0);
        Cinema cinemaMahasiswa = new CinemaMahasiswa(100.0);

        System.out.println("Harga Tiket Dasar        : Rp 100.000");
        System.out.println("Biaya Admin Standard (10%): Rp " + (standardCinema.calculateAdminFee() * 1000));
        System.out.println("Biaya Admin Deluxe   (12%): Rp " + (deluxeCinema.calculateAdminFee() * 1000));
        System.out.println("Biaya Admin Premium  (20%): Rp " + (premiumCinema.calculateAdminFee() * 1000));
        System.out.println("Biaya Admin Mahasiswa (5%): Rp " + (cinemaMahasiswa.calculateAdminFee() * 1000) + " [TARIF KHUSUS MAHASISWA]");
    }
}
