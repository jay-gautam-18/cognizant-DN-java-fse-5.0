public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(201, "Java Programming Book", 50, 1200));
        inventory.addProduct(new Product(202, "Data Structures", 30, 1500));
        inventory.addProduct(new Product(203, "Design Patterns", 25, 950));
        inventory.addProduct(new Product(204, "Clean Code", 40, 1100));
        inventory.addProduct(new Product(205, "Intro to Algorithms", 15, 2500));

        System.out.println("Initial Inventory:");
        inventory.displayProduct();

        System.out.println("\nAfter Updating Product:");
        inventory.updateProduct(
                new Product(205, "Intro to Algorithms (4th Edition)", 20, 2800)
        );
        inventory.displayProduct();

        System.out.println("\nAfter Removing Product:");
        inventory.removeProduct(204);
        inventory.displayProduct();
    }
}