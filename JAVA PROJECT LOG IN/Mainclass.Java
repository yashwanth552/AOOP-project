// Main.java
public class Main {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        logger.log("Application started.");
        logger.log("Performing some operations...");

        // Ensure to close the logger at the end of the application
        LogManager.shutdown();
    }
}
