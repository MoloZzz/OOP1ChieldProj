package flower_shop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BouquetTest {

    @Test
    void testCalculateTotalPrice() {
        Bouquet bouquet = new Bouquet();

        // Створюємо мок-об'єкти квітів та аксесуарів
        Flower mockFlower1 = new Rose("Mock Rose 1", Color.RED, 10.0, 50, 5, true);
        Flower mockFlower2 = new Lily("Mock Lily 2", Color.YELLOW, 8.0, 40, 4, true);
        Accessory mockAccessory1 = new Accessory("Mock Ribbon", 2.0);

        // Додаємо мок-об'єкти до букету
        bouquet.addFlower(mockFlower1);
        bouquet.addFlower(mockFlower2);
        bouquet.addAccessory(mockAccessory1);

        // Очікуємо, що вартість букету буде сумою вартості квітів та аксесуарів
        assertEquals(20.0, bouquet.calculateTotalPrice());
    }

    @Test
    void testSortFlowersByFreshness() {
        Bouquet bouquet = new Bouquet();

        // Додаємо квіти з різними рівнями свіжості
        Flower freshFlower = new Rose("Fresh Rose", Color.RED, 10.0, 50, 5, true);
        Flower lessFreshFlower = new Lily("Less Fresh Lily", Color.YELLOW, 8.0, 40, 4, true);
        Flower mediumFreshFlower = new Rose("Medium Fresh Rose", Color.WHITE, 12.0, 55, 6, false);

        bouquet.addFlower(freshFlower);
        bouquet.addFlower(lessFreshFlower);
        bouquet.addFlower(mediumFreshFlower);

        // Сортуємо квіти за свіжістю
        bouquet.sortFlowersByFreshness();

        // Перевіряємо, чи квіти відсортовані в правильному порядку
        assertEquals(freshFlower, bouquet.getFlowers().get(1));
        assertEquals(mediumFreshFlower, bouquet.getFlowers().get(0));
        assertEquals(lessFreshFlower, bouquet.getFlowers().get(2));
    }

    @Test
    void testFindFlowerByStemLength() {
        Bouquet bouquet = new Bouquet();

        // Додаємо квіти з різними довжинами стебел
        Flower flower1 = new Rose("Rose 1", Color.RED, 10.0, 60, 5, true);
        Flower flower2 = new Lily("Lily 2", Color.YELLOW, 8.0, 45, 4, true);
        Flower flower3 = new Rose("Rose 3", Color.WHITE, 12.0, 55, 6, false);

        bouquet.addFlower(flower1);
        bouquet.addFlower(flower2);
        bouquet.addFlower(flower3);

        // Пошук квіту за діапазоном довжини стебла
        Flower foundFlower = bouquet.findFlowerByStemLength(40, 50);

        // Перевіряємо, чи знайдений квіт відповідає діапазону
        assertEquals(flower2, foundFlower);
    }
}