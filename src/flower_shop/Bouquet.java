package flower_shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Bouquet {
    private List<Flower> flowers;
    private List<Accessory> accessories;

    public Bouquet() {
        this.flowers = new ArrayList<>();
        this.accessories = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
    }

    public double calculateTotalPrice() {
        double totalFlowerPrice = flowers.stream().mapToDouble(Flower::getPrice).sum();
        double totalAccessoryPrice = accessories.stream().mapToDouble(Accessory::getPrice).sum();
        return totalFlowerPrice + totalAccessoryPrice;
    }

    public void sortFlowersByFreshness() {
        Collections.sort(flowers, Comparator.comparingInt(Flower::getFreshnessLevel).reversed());
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }

    public Flower findFlowerByStemLength(int minLength, int maxLength) {
        for (Flower flower : flowers) {
            int stemLength = flower.getStemLength();
            if (stemLength >= minLength && stemLength <= maxLength) {
                return flower;
            }
        }
        return null;
    }
}
