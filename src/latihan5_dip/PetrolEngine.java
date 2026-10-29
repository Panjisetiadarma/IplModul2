package latihan5_dip;

public class PetrolEngine implements EngineInterface {
    @Override
    public void start() {
        System.out.println("[PetrolEngine] Mesin bensin menyala: Vrrrooommm!");
    }
}
