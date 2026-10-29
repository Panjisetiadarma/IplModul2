package latihan2_ocp;

public abstract class Cinema {
    public Double price;

    public Cinema(Double price) {
        this.price = price;
    }

    public abstract Double calculateAdminFee();
}
