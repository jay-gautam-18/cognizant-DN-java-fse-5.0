public class Main {

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        if(logger1 == logger2) {
            System.out.println("Both the logger instances are the same");
        }else {
            System.out.println("Logger instances are not same");
        }

        System.out.println();

        loggerTest(logger1, logger2);
    }

    public static void loggerTest(Logger logger1, Logger logger2) {
        logger1.setUsernameAndPassword("jay", "0985689");
        logger2.setUsernameAndPassword("ellu", "124237t4208");
        
        System.out.println("Logger 1 credential:");
        logger1.displayCredentials();
        System.out.println("-------------------------");
        System.out.println("Logger 2 credential:");
        logger2.displayCredentials();


        System.out.println("\nBoth credential will be same because both are same instance");
    }
}