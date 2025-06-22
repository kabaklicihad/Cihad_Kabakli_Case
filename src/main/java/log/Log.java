package log;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log {

    Logger logger = Logger.getLogger(Log.class);

    public Log() {

        DOMConfigurator.configure("log4j.xml");
    }

    public void log(String msg) {
        logger.info(msg);
    }
}