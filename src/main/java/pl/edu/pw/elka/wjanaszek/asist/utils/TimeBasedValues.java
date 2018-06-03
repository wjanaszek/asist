package pl.edu.pw.elka.wjanaszek.asist.utils;

import lombok.Getter;
import lombok.Setter;
import pl.edu.pw.elka.wjanaszek.asist.domain.notification.PluralTimeType;
import pl.edu.pw.elka.wjanaszek.asist.domain.notification.SingleTimeType;
import pl.edu.pw.elka.wjanaszek.asist.domain.notification.TimeBased;

@Getter
@Setter
public class TimeBasedValues {
    private Integer seconds;
    private Integer minutes;
    private Integer hours;

    public static TimeBasedValues getTimeBasedValues(TimeBased timeBased) {
        TimeBasedValues timeBasedValues = new TimeBasedValues();
        Integer seconds = null, minutes = null, hours = null;
        if (timeBased.getPluralTimeType() != null) {
            seconds = timeBased.getPluralTimeType() == PluralTimeType.SECONDS ? timeBased.getValue() * 1000 : null;
            minutes = timeBased.getPluralTimeType() == PluralTimeType.MINUTES ? timeBased.getValue() * 60 * 1000 : null;
            hours = timeBased.getPluralTimeType() == PluralTimeType.HOURS ? timeBased.getValue() * 60 * 60 * 1000 : null;
        } else if (timeBased.getSingleTimeType() != null) {
            seconds = timeBased.getSingleTimeType() == SingleTimeType.SECOND ? timeBased.getValue() * 1000 : null;
            minutes = timeBased.getSingleTimeType() == SingleTimeType.MINUTE ? timeBased.getValue() * 60 * 1000 : null;
            hours = timeBased.getSingleTimeType() == SingleTimeType.HOUR ? timeBased.getValue() * 60 * 60 * 1000 : null;
        }
        timeBasedValues.setSeconds(seconds);
        timeBasedValues.setMinutes(minutes);
        timeBasedValues.setHours(hours);
        return timeBasedValues;
    }
}
