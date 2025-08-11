public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.replaceFirst("^\\S+\\s*","").trim();
    }

    public static String logLevel(String logLine) {
        return logLine.replaceAll("^\\[(.*?)\\].*", "$1").toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine)+"("+logLevel(logLine)+ ")";

    }
}
