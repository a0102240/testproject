package java24.board;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4jTest {
    private static Logger log = LoggerFactory.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        java.io.File log4jfile = new java.io.File("src/main/resources/log4j.properties");
        org.apache.log4j.PropertyConfigurator.configure( log4jfile.getAbsolutePath() );
        log.info("hi");
        if (log.isDebugEnabled()){
            log.debug("hi");
        }
    }
}
