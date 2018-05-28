package pl.edu.pw.elka.wjanaszek.asist.domain.task;

import lombok.Getter;
import lombok.Setter;
import pl.edu.pw.elka.wjanaszek.asist.utils.StringUtil;

import java.awt.*;
import java.net.MalformedURLException;
import java.util.Timer;
import java.util.TimerTask;

@Getter
@Setter
public class NotificationTask extends BaseTask {

    class Notification extends TimerTask {
        private String message;
        private String title;

        private void displayTray() throws AWTException, MalformedURLException {
            // Obtain only one instance of the SystemTray object
            SystemTray tray = SystemTray.getSystemTray();

            // If the icon is a file
            Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
            // Alternative (if the icon is on the classpath):
            // Image image = Toolkit.getToolkit().createImage(getClass().getResource("icon.png"));

            TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
            // Let the system resize the image if needed
            trayIcon.setImageAutoSize(true);
            // Set tooltip text for the tray icon
            trayIcon.setToolTip("System tray icon demo");
            tray.add(trayIcon);

            trayIcon.displayMessage(this.title, this.message, TrayIcon.MessageType.INFO);
        }

        public void run() {
            if (SystemTray.isSupported()) {
                try {
                    this.displayTray();
                } catch (AWTException e) {
                    e.printStackTrace();
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            } else {
                System.err.println("System tray not supported");
            }
        }

        public Notification(String message, String title) {
            this.message = message;
            this.title = title;
        }
    }

    public NotificationTask(Boolean active, String message, String title) {
        this.active = active;
        this.message = StringUtil.removeQuotesAndDoubleQuotes(message);
        this.title = title;
        this.timer = new Timer(title);
    }

    public void toggleNotification() {
        if (this.active) {
            this.active = !this.active;
            this.timer.cancel();
            this.timer.purge();
        } else {
            this.timer = new Timer(this.title);
            this.active = !this.active;
            Notification notification = new Notification(this.message, this.title);
            if (this.date != null) {
                this.timer.schedule(notification, this.date);
            } else if (this.seconds != null) {
                if (this.delay != null) {
                    this.timer.schedule(notification, this.seconds);
                } else if (this.period != null) {
                    this.timer.schedule(notification, 0, this.seconds);
                }
            } else if (this.minutes != null) {
                if (this.delay != null) {
                    this.timer.schedule(notification, this.minutes);
                } else if (this.period != null) {
                    this.timer.schedule(notification, 0, this.minutes);
                }
            } else if (this.hours != null) {
                if (this.delay != null) {
                    this.timer.schedule(notification, this.hours);
                } else if (this.period != null) {
                    this.timer.schedule(notification, 0, this.hours);
                }
            }
        }
    }

    @Override
    public String toString() {
        return super.toString();

    }
}
