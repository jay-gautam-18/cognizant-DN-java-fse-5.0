public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop();
        shop.storeProducts();

        int targetProductId = 8;
        long startTime, endTime;

        System.out.println("=== Linear Search ===");
        startTime = System.nanoTime();

        int result = shop.linearSearch(targetProductId);

        endTime = System.nanoTime();

        shop.displayProduct(result);
        System.out.println("Execution Time: " + (endTime - startTime) + " ns");

        System.out.println("--------------------------------");

        // Binary Search
        System.out.println("=== Binary Search ===");
        startTime = System.nanoTime();

        result = shop.binarySearch(targetProductId);

        endTime = System.nanoTime();

        shop.displayProduct(result);
        System.out.println("Execution Time: " + (endTime - startTime) + " ns");
    }
}