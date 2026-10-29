package latihan2_ocp;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 2.2.2 LATIHAN 2: OPEN/CLOSED PRINCIPLE (OCP) ===");
        Cinema standardCinema = new StandardCinema(100.0);
        Cinema deluxeCinema = new DeluxeCinema(100.0);
        Cinema premiumCinema = new PremiumCinema(100.0);

        System.out.println("Harga Tiket Dasar: Rp 100.000");
        System.out.println("Biaya Admin Standard Cinema (10%): Rp " + (standardCinema.calculateAdminFee() * 1000));
        System.out.println("Biaya Admin Deluxe Cinema   (12%): Rp " + (deluxeCinema.calculateAdminFee() * 1000));
        System.out.println("Biaya Admin Premium Cinema  (20%): Rp " + (premiumCinema.calculateAdminFee() * 1000));
    }
}
