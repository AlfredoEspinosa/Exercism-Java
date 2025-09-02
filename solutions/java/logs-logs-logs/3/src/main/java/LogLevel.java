public enum LogLevel {
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42),
    UNKNOWN(0);

    private final int shortLogLevelFormat;

    private LogLevel(int shortLogLevelFormat) {
        this.shortLogLevelFormat = shortLogLevelFormat;
    }

    public int getShortLevelFormat(){
        return this.shortLogLevelFormat;
    } 

    
}
