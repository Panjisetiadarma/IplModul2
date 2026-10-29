package latihan5_dip;

public class Car {
    private final EngineInterface engine;

    public Car(EngineInterface engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }
}
