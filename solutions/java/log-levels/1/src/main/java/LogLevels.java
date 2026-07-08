public class LogLevels {
    
    public static String message(String logLine) {
        int messageStartIndex = logLine.indexOf("]: ") + 3;
        String rawMessage = logLine.substring(messageStartIndex);
        return rawMessage.trim();
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf("[") + 1;
        int end = logLine.indexOf("]");
        return logLine.substring(start, end).toLowerCase();
    }

    public static String reformat(String logLine) {
        String cleanedMessage = message(logLine);
        String cleanLevel = logLevel(logLine);
        return cleanedMessage + " (" +  cleanLevel + ")";
    }
}
