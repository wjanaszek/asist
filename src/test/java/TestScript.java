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

    @Test
    public void using_turn_off_should_make_notification_inactive() {
        Asist.getNotificationMap().get("test").toggleNotification();
        Asist.serveSource("turn_off->(all)");
        assertEquals(Asist.getNotificationMap().get("test").getActive(), false);
    }

    @Test
    public void using_turn_off_by_id_should_make_notification_inactive() {
        Asist.serveSource("notify test2 in 5 minutes 'test2' with os_notification");
        Asist.serveSource("turn_off->('test2')");
        assertEquals(Asist.getNotificationMap().get("test2").getActive(), false);
    }

    @Test
    public void using_delete_by_id_should_remove_notification_from_map() {
        Asist.serveSource("delete->('test')");
        assertEquals(Asist.getNotificationMap().containsKey("test"), false);
    }

    @Test
    public void using_delete_all_should_remove_all_notifications_from_map() {
        Asist.serveSource("notify test in 5 minutes 'test' with os_notification");
        Asist.serveSource("notify test3 in 5 minutes 'test3' with os_notification");
        Asist.serveSource("delete->(all)");
        assertEquals(Asist.getNotificationMap().size(), 0);
    }
}
