package Task;
import org.apache.log4j.Logger;
public class TestLogger {

    Logger log=Logger.getLogger(TestLogger.class);

String  f()
{
    log.info("testlogger");
    return "OK";
}

}
