package latihan4_isp;

public class Motorcycle implements VehicleInterface {
    @Override
    public void drive() {
        System.out.println("[Motorcycle] Sepeda motor dikendarai melaju dengan stabil.");
    }

    @Override
    public void stop() {
        System.out.println("[Motorcycle] Sepeda motor berhenti dan menginjak rem.");
    }

    @Override
    public void refuel() {
        System.out.println("[Motorcycle] Mengisi bensin tangki sepeda motor.");
    }
}
