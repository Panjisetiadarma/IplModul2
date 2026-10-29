package latihan4_isp;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 2.2.4 LATIHAN 4: INTERFACE SEGREGATION PRINCIPLE (ISP) ===");
        Motorcycle motor = new Motorcycle();
        Car mobil = new Car();

        System.out.println("--- Pengujian Sepeda Motor (Hanya VehicleInterface) ---");
        motor.drive();
        motor.refuel();
        motor.stop();

        System.out.println("\n--- Pengujian Mobil (VehicleInterface & DoorInterface) ---");
        mobil.openDoors();
        mobil.drive();
        mobil.refuel();
        mobil.stop();
    }
}
