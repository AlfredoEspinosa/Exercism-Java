
import java.util.StringTokenizer;

public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.replaceAll("\\[.*?\\]:", "").replaceAll("\\\\r|\\\\n", "").trim();
    }

    public static String logLevel(String logLine) {
        return logLine.replaceAll("\\[ERROR\\]:.*", "error");
    }

    public static String reformat(String logLine) {
        StringTokenizer st = new StringTokenizer(logLine, ":");
        String loglevel = st.nextToken().replace('[', '(').replace(']', ')').toLowerCase().trim();
        String message = st.nextToken();
        return message +" "+ loglevel;
    }
}
