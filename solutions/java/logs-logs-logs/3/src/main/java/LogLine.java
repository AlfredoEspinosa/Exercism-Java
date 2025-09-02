


public class LogLine {

    String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String logLevel = this.logLine.substring(this.logLine.indexOf('[')+1, this.logLine.indexOf(']'));
        return switch (logLevel) {
            case "TRC" ->  LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default ->  LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        String shortLog = String.valueOf(this.getLogLevel().getShortLevelFormat());
        shortLog = shortLog+":"+this.logLine.substring(this.logLine.indexOf(':')+1,this.logLine.length()).trim();
        return shortLog;
    }
}
