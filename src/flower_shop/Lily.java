package flower_shop;

public class Lily extends Flower{
    private boolean isFragrant;

    public Lily(String name, Color color, double price, int stemLength, int freshnessLevel, boolean isFragrant) {
        super(name, color, price, stemLength, freshnessLevel);
        this.isFragrant = isFragrant;
    }

    @Override
    public String toString() {
        return "lily: " + this.name + " " + this.color + " price: " + this.price + " stemLength: " + this.stemLength + " freshnessLevel: " + this.freshnessLevel;
    }

    public boolean isFragrant() {
        return isFragrant;
    }

}
