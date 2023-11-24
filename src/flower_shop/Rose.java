package flower_shop;

public class Rose extends Flower{
        private boolean hasThorns;

        public Rose(String name, Color color, double price, int stemLength, int freshnessLevel, boolean hasThorns) {
                super(name, color, price, stemLength, freshnessLevel);
                this.hasThorns = hasThorns;
        }

        public boolean hasThorns() {
                return hasThorns;
        }

        @Override
        public String toString() {
                return "rose: " + this.name + " " + this.color + " price: " + this.price + " stemLength: " + this.stemLength + " freshnessLevel: " + this.freshnessLevel;
        }

}
