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
}
