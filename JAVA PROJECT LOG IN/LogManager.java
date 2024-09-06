public // LogManager.java
public class LogManager {
    private static Logger logger = Logger.getInstance();

    public static Logger getLogger() {
        return logger;
    }

    public static void shutdown() {
        if (logger != null) {
            logger.close();
        }
    }
}
 {
    
}
