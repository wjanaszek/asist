package pl.edu.pw.elka.wjanaszek.asist.domain.task;

import lombok.Getter;
import lombok.Setter;
import pl.edu.pw.elka.wjanaszek.asist.domain.notification.NotificationStatement;
import pl.edu.pw.elka.wjanaszek.asist.domain.notification.TimeBased;
import pl.edu.pw.elka.wjanaszek.asist.domain.notification.TimeBasedType;
import pl.edu.pw.elka.wjanaszek.asist.domain.notification.TimePrecisely;
import pl.edu.pw.elka.wjanaszek.asist.utils.TimeBasedValues;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

@Getter
@Setter
public class BaseTask {
    protected String message;
    protected String title;
    protected Boolean active;
    protected Timer timer;
    // date properties
    protected Integer minutes;
    protected Integer seconds;
    protected Integer hours;
    protected Date date;
    protected Integer period;
    protected Integer delay;

    public void toggleNotification() {
    }

    @Override
    public String toString() {
        String result = "title: " + title + ", message: " + message + ", active: " + active;
        if (period != null) {
            result += ", type: EVERY (cyclic)";
        }
        if (delay != null) {
            result += ", type: IN (after some delay)";
        }
        if (seconds != null) {
            result += ", seconds: " + seconds / 1000;
        } else if (minutes != null) {
            result += ", minutes: " + minutes / 60 * 1000;
        } else if (hours != null) {
            result += ", hours: " + hours / 60 * 60 * 1000;
        } else if (date != null) {
            result += ", date: " + date;
        }
        return result;
    }

    public void setTimeValues(NotificationStatement statement, Map<String, Class> packageMap) {
        if (statement.getFiredWhen().getTimeBased().getType() != null) {
            TimeBased timeBased = statement.getFiredWhen().getTimeBased();
            TimeBasedValues timeBasedValues;
            if (statement.getFiredWhen().getTimeBased().getType() == TimeBasedType.IN) {
                timeBasedValues = TimeBasedValues.getTimeBasedValues(timeBased);
                if (timeBasedValues.getSeconds() != null) {
                    this.setDelay(timeBasedValues.getSeconds());
                    this.setSeconds(timeBasedValues.getSeconds());
                } else if (timeBasedValues.getMinutes() != null) {
                    this.setDelay(timeBasedValues.getMinutes());
                    this.setMinutes(timeBasedValues.getMinutes());
                } else if (timeBasedValues.getHours() != null) {
                    this.setDelay(timeBasedValues.getHours());
                    this.setHours(timeBasedValues.getHours());
                }
            } else if (statement.getFiredWhen().getTimeBased().getType() == TimeBasedType.EVERY) {
                timeBasedValues = TimeBasedValues.getTimeBasedValues(timeBased);
                if (timeBasedValues.getSeconds() != null) {
                    this.setPeriod(timeBasedValues.getSeconds());
                    this.setSeconds(timeBasedValues.getSeconds());
                } else if (timeBasedValues.getMinutes() != null) {
                    this.setPeriod(timeBasedValues.getMinutes());
                    this.setMinutes(timeBasedValues.getMinutes());
                } else if (timeBasedValues.getHours() != null) {
                    this.setPeriod(timeBasedValues.getHours());
                    this.setHours(timeBasedValues.getHours());
                }
            }
        } else if (statement.getFiredWhen().getTimePrecisely().getTime() != null) {
            TimePrecisely timePrecisely = statement.getFiredWhen().getTimePrecisely();
            String hour, minute, day, month, year, date = "", time = "";
            if (timePrecisely.getTime() != null) {
                hour = timePrecisely.getTime().split("/")[0];
                minute = timePrecisely.getTime().split("/")[1];
                time = hour + ":" + minute + ":00";
            }
            if (timePrecisely.getDate() != null) {
                day = timePrecisely.getDate().split("/")[0];
                month = timePrecisely.getDate().split("/")[1];
                year = timePrecisely.getDate().split("/")[2];
                date = day + "-" + month + "-" + year;
            } else {
                date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
            }
            date += " " + time;
            try {
                this.setDate(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(date));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else if (statement.getFiredWhen().getOnEvent() != null) {
            for (String identifier : statement.getFiredWhen().getOnEvent().getIdentifier()) {
                if (!packageMap.containsKey(identifier)) {
                    throw new IllegalStateException(identifier);
                }
            }
        }
    }

    protected void dispatchTask(TimerTask task) {
        if (this.date != null) {
            this.timer.schedule(task, this.date);
        } else if (this.seconds != null) {
            if (this.delay != null) {
                this.timer.schedule(task, this.seconds);
            } else if (this.period != null) {
                this.timer.schedule(task, 0, this.seconds);
            }
        } else if (this.minutes != null) {
            if (this.delay != null) {
                this.timer.schedule(task, this.minutes);
            } else if (this.period != null) {
                this.timer.schedule(task, 0, this.minutes);
            }
        } else if (this.hours != null) {
            if (this.delay != null) {
                this.timer.schedule(task, this.hours);
            } else if (this.period != null) {
                this.timer.schedule(task, 0, this.hours);
            }
        }
    }
}
