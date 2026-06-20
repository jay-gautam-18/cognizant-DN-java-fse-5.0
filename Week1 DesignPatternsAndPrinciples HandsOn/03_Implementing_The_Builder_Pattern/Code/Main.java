public class Main {
    public static void main(String[] args) {

        System.out.println("Builder Design Pattern");
        System.out.println("----------------------");

        Computer.Builder builder = new Computer.Builder();
        builder.setCPU("Macbook Air M5");
        builder.setRAM("16GB Unified Memory");
        builder.setSTORAGE("512GB SSD");

        System.out.println(builder.build());

        System.out.println();

        builder = new Computer.Builder();
        builder.setCPU("Macbook Air M5 pro");
        builder.setRAM("64GB unified memory");
        builder.setSTORAGE("2TB SSD");

        System.out.println(builder.build());
    }
}