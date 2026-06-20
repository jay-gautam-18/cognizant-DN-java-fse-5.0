public class Cart {
    private Order[] orders = new Order[10];

    public void shuffleOrders() {
        // Changed static data: Tech Pioneers theme
        orders[0] = new Order(1, "Ada Lovelace", 3200);
        orders[1] = new Order(2, "Alan Turing", 1850);
        orders[2] = new Order(3, "Grace Hopper", 4100);
        orders[3] = new Order(4, "Tim Berners-Lee", 2750);
        orders[4] = new Order(5, "Linus Torvalds", 5600);
        orders[5] = new Order(6, "Margaret Hamilton", 8900);
        orders[6] = new Order(7, "Katherine Johnson", 3450);
        orders[7] = new Order(8, "John von Neumann", 6720);
        orders[8] = new Order(9, "Claude Shannon", 4300);
        orders[9] = new Order(10, "Hedy Lamarr", 2100);
    }

    public Order[] getOrders(){
        return orders;
    }

    public void displayOrders(Order[] orders){
        for(Order order : orders){
            System.out.printf("Id : %d | Customer Name : %s | Total Price : %d\n", order.getOrderId(), order.getCustomerName(), order.getTotalPrice());
        }
    }

    public void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private int partition(Order[] orders, int low, int high) {
        int pivot = orders[high].getTotalPrice();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() < pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }
}