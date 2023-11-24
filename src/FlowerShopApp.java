import flower_shop.*;

public class FlowerShopApp {


    public static void main(String[] args) {

        Flower redRose = new Rose("Red Rose", Color.RED, 10.0, 50, 5, true);
        Flower whiteRose = new Rose("White Rose", Color.WHITE, 12.0, 55, 6, false);
        Flower yellowLily = new Lily("Yellow Lily", Color.YELLOW, 8.0, 40, 4, true);

        System.out.println("Information about flowers:");
        System.out.println(redRose);
        System.out.println(whiteRose);
        System.out.println(yellowLily);

        Accessory ribbon = new Accessory("Ribbon", 2.0);
        Accessory vase = new Accessory("Vase", 5.0);

        System.out.println(ribbon);
        System.out.println(vase);



        Bouquet bouquet = new Bouquet();

        bouquet.addFlower(redRose);
        bouquet.addFlower(whiteRose);
        bouquet.addFlower(yellowLily);

        bouquet.addAccessory(ribbon);
        bouquet.addAccessory(vase);

        System.out.println("Bouquet Total Price: $" + bouquet.calculateTotalPrice());

        bouquet.sortFlowersByFreshness();
        System.out.println("Bouquet Information after Sorting:");
        for (Flower flower : bouquet.getFlowers()) {
            System.out.println(flower);
        }

        Flower foundFlower = bouquet.findFlowerByStemLength(45, 55);

        if (foundFlower != null) {
            System.out.println("Found Flower: " + foundFlower);
        } else {
            System.out.println("No Flower found in the specified stem length range.");
        }
    }
}