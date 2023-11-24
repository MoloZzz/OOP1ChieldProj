package flower_shop;

public class Flower {
    public Flower(String name,Color color,double price){
        this.name = name;
        this.color = color;
        this.price = price;
        this.stemLength = 1;
        this.freshnessLevel = 1;
    }


    public Flower(String name,Color color,double price,int stemLength){
        this.name = name;
        this.color = color;
        this.price = price;
        this.stemLength = stemLength;
        this.freshnessLevel = 1;
    }

    public Flower(String name,Color color,double price,int stemLength,int freshnessLevel){
        this.name = name;
        this.color = color;
        this.price = price;
        this.stemLength = stemLength;
        this.freshnessLevel = freshnessLevel;
    }
    protected String type;
    protected String name;
    protected Color color;
    protected double price;
    protected int stemLength;
    protected int freshnessLevel; //від 0 до 10, 0 - згнили, 10 - свіжі

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getStemLength() {
        return stemLength;
    }

    public int getFreshnessLevel() {
        return freshnessLevel;
    }


    @Override
    public String toString() {
        return "flower: " + this.name + " " + this.color + " price: " + this.price + " stemLength: " + this.stemLength + " freshnessLevel: " + this.freshnessLevel;
    }

}
