package latihan4_isp;

public class Car implements VehicleInterface, DoorInterface {
    @Override
    public void drive() {
        System.out.println("[Car] Mobil melaju di jalan raya.");
    }

    @Override
    public void stop() {
        System.out.println("[Car] Mobil berhenti sempurna dan menarik rem parkir.");
    }

    @Override
    public void refuel() {
        System.out.println("[Car] Mengisi bahan bakar mobil di SPBU.");
    }

    @Override
    public void openDoors() {
        System.out.println("[Car] Pintu mobil dibuka untuk akses masuk penumpang.");
    }
}
