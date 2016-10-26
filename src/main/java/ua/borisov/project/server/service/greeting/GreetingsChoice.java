package ua.borisov.project.server.service.greeting;

import org.apache.log4j.Logger;

import java.io.UnsupportedEncodingException;
import java.time.LocalTime;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by User on 24.10.2016.
 */
public class GreetingsChoice {
    private static final Logger log = Logger.getLogger(GreetingsChoice.class);
    private static final LocalTime morning = LocalTime.of(6, 0, 0, 0);
    private static final LocalTime day = LocalTime.of(9, 0, 0, 0);
    private static final LocalTime evening = LocalTime.of(19, 0, 0, 0);
    private static final LocalTime night = LocalTime.of(23, 0, 0, 0);

    public String choice(Locale locale, LocalTime now, String encoding) {
        String result = null;
        ResourceBundle rb = ResourceBundle.getBundle("ua/borisov/project/client/Messages", locale, new UTF8Control());
        log.info("Current time " + now);
        try {
            if ((now.isAfter(night) || now.equals(night)) || (now.isBefore(morning))) {
                String night = rb.getString("night");
                result ="1)" + new String((night.getBytes(encoding)));

            }
            if ((now.isAfter(morning) || now.equals(morning)) & now.isBefore(day)) {
                String morning = rb.getString("morning");
                result ="1)" + new String((morning.getBytes(encoding)));

            }
            if ((now.isAfter(day) || now.equals(day)) & now.isBefore(evening)) {
                String day = rb.getString("day");
                result = "1)" + new String((day.getBytes(encoding)));

            }
            if ((now.isAfter(evening) || now.equals(evening)) & now.isBefore(night)) {
                String evening = rb.getString("evening");
                result = "1)" + new String((evening.getBytes(encoding)));

            }

        } catch (UnsupportedEncodingException e) {
            log.error("Error while encoding 'result! '",e);
        }
        log.info("Greetings in that moment is : " + result);
        return result;
    }
}
