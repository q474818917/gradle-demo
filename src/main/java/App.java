/**
 * Created by wangzx on 16/11/15.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class App {

    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String args[]){
        logger.trace("====== trace");
        logger.debug("====== debug");
        logger.info("====== info");
        logger.warn("====== warn");
        logger.error("====== error");

    }
}