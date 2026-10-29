package latihan5_dip;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 2.2.5 LATIHAN 5: DEPENDENCY INVERSION PRINCIPLE (DIP) ===");
        Car fuelCar = new Car(new PetrolEngine());
        Car dieselCar = new Car(new DieselEngine());
        Car hybridCar = new Car(new HybridEngine());

        System.out.print("Menyalakan Mobil Bensin: ");
        fuelCar.start();

        System.out.print("Menyalakan Mobil Diesel: ");
        dieselCar.start();

        System.out.print("Menyalakan Mobil Hybrid: ");
        hybridCar.start();
    }
}
