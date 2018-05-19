package app.datadownloader;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

/**
 * Handles logs for all packages of BossaDownloader
 */
public class LogHandlerFilter implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        String[] name = record.getSourceClassName().split("\\.");
        return name[0].equals("app");
    }
}
