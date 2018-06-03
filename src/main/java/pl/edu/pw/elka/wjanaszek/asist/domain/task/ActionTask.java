package pl.edu.pw.elka.wjanaszek.asist.domain.task;

import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Timer;
import java.util.TimerTask;

@Getter
@Setter
public class ActionTask extends BaseTask {
    private Method method;
    private Object object;
    private String[] params;

    class Notification extends TimerTask {
        public void run() {
            try {
                method.invoke(object, params);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    public void toggleNotification() {
        if (this.active) {
            this.active = !this.active;
            this.timer.cancel();
            this.timer.purge();
        } else {
            this.timer = new Timer(this.title);
            this.active = !this.active;
            this.dispatchTask(new ActionTask.Notification());
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
