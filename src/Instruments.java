public abstract class Instruments {

    protected String name;
    protected double price;

    public Instruments(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public abstract void play();
}