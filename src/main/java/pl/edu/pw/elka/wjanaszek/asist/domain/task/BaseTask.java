package pl.edu.pw.elka.wjanaszek.asist.domain.task;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Timer;

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
        if (seconds != null) {
            result += ", seconds: " + seconds / 1000;
        } else if (minutes != null) {
            result += ", minutes: " + minutes / 60*1000;
        } else if (hours != null) {
            result += ", hours: " + hours / 60*60*1000;
        } else if (date != null) {
            result += ", date: " + date;
        }
        return result;
    }
}
