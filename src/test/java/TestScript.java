import org.junit.Test;
import pl.edu.pw.elka.wjanaszek.asist.Asist;

import static org.junit.Assert.assertEquals;

public class TestScript {
    @Test
    public void adding_new_notification_should_add_it_to_map() {
        Asist.serveSource("notify test in 5 minutes 'test' with os_notification");
        assertEquals(Asist.getNotificationMap().containsKey("test"), true);
    }

    @Test
    public void added_notification_should_be_active() {
        assertEquals(Asist.getNotificationMap().get("test").getActive(), true);
    }

    @Test
    public void after_toggling_notification_should_be_inactive() {
        Asist.getNotificationMap().get("test").toggleNotification();
        assertEquals(Asist.getNotificationMap().get("test").getActive(), false);
    }
}
