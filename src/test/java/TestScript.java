import org.junit.Test;
import pl.edu.pw.elka.wjanaszek.asist.Asist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class TestScript {
    @Test
    public void adding_new_notification_should_add_it_to_map() {
        Asist.serveSource("notify test in 5 minutes 'test' with os_notification");
        assertEquals(Asist.getNotificationMap().containsKey("test"), true);
    }

    @Test
    public void added_notification_should_display_message_in_5_minutes() {
        boolean date = Asist.getNotificationMap().get("test").getDate() == null;
        boolean seconds = Asist.getNotificationMap().get("test").getSeconds() == null;
        boolean minutes = Asist.getNotificationMap().get("test").getMinutes() != null
                && Asist.getNotificationMap().get("test").getMinutes().equals(5 * 60 * 1000);
        boolean hours = Asist.getNotificationMap().get("test").getHours() == null;
        assertEquals(date && seconds && minutes && hours, true);
    }

    @Test
    public void added_notification_should_display_message_only_once() {
        boolean period = Asist.getNotificationMap().get("test").getPeriod() == null;
        boolean delay = Asist.getNotificationMap().get("test").getDelay() != null;
        assertEquals(period && delay, true);
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
    public void using_turn_on_should_make_notification_active() {
        Asist.serveSource("turn_on->(all)");
        assertEquals(Asist.getNotificationMap().get("test").getActive(), true);
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

    @Test
    public void added_notification_should_display_message_in_5_seconds() {
        Asist.serveSource("notify test every 5 seconds 'test' with os_notification");
        boolean date = Asist.getNotificationMap().get("test").getDate() == null;
        boolean seconds = Asist.getNotificationMap().get("test").getSeconds() != null
                && Asist.getNotificationMap().get("test").getSeconds().equals(5 * 1000);
        boolean minutes = Asist.getNotificationMap().get("test").getMinutes() == null;
        boolean hours = Asist.getNotificationMap().get("test").getHours() == null;
        assertEquals(date && seconds && minutes && hours, true);
    }

    @Test
    public void added_notification_should_display_forever() {
        boolean period = Asist.getNotificationMap().get("test").getPeriod() != null;
        boolean delay = Asist.getNotificationMap().get("test").getDelay() == null;
        assertEquals(period && delay, true);
    }

    @Test
    public void declaring_variable_without_value_should_add_it_to_map() {
        Asist.serveSource("variable");
        assertEquals(Asist.getVariableMap().containsKey("variable"), true);
    }

    @Test
    public void declared_variable_without_value_should_have_no_value() {
        assertEquals(Asist.getVariableMap().get("variable"), "");
    }

    @Test
    public void assigning_value_to_variable_should_add_value() {
        Asist.serveSource("variable = 5");
        assertEquals(Asist.getVariableMap().get("variable"), "5");
    }

    @Test
    public void assigning_value_to_variable_with_assigned_value_should_change_its_value() {
        boolean assign = Asist.getVariableMap().get("variable").equals("5");
        Asist.serveSource("variable = 'a'");
        boolean reassign = Asist.getVariableMap().get("variable").equals("'a'");
        assertEquals(assign && reassign, true);
    }

    @Test
    public void adding_5_and_2_should_give_7() {
        Asist.serveSource("variable = 5 + 2");
        assertEquals(Asist.getVariableMap().get("variable"), "7");
    }

    @Test
    public void substracting_2_from_5_should_give_3() {
        Asist.serveSource("variable = 5 - 2");
        assertEquals(Asist.getVariableMap().get("variable"), "3");
    }

    @Test
    public void multiplying_2_3_times_should_give_6() {
        Asist.serveSource("variable = 2 * 3");
        assertEquals(Asist.getVariableMap().get("variable"), "6");
    }

    @Test
    public void dividing_2_by_3_should_give_0() {
        Asist.serveSource("variable = 2 : 3");
        assertEquals(Asist.getVariableMap().get("variable"), "0");
    }

    @Test
    public void dividing_2_by_1_should_give_2() {
        Asist.serveSource("variable = 2 : 1");
        assertEquals(Asist.getVariableMap().get("variable"), "2");
    }

    @Test
    public void calculating_complex_formula_should_give_correct_result() {
        Asist.serveSource("variable = 2 + 2 * 2 - 4 : 1 + 1");
        assertEquals(Asist.getVariableMap().get("variable"), "3");
    }

    @Test
    public void importing_new_package_should_add_it_to_map() {
        Asist.serveSource("import Mail");
        assertEquals(Asist.getPackageMap().containsKey("Mail"), true);
    }

    @Test
    public void imported_package_should_be_readed_by_class_loader() {
        assertNotSame(Asist.getPackageMap().get("Mail"), null);
    }

    @Test(expected = IllegalStateException.class)
    public void importing_not_existed_package_should_cause_an_error() {
        Asist.serveSource("import somePackage");
    }

    @Test(expected = IllegalStateException.class)
    public void using_variable_without_value_should_cause_an_error() {
        Asist.serveSource("variable = a + 5");
    }

    @Test(expected = IllegalStateException.class)
    public void using_not_defined_function_should_cause_an_error() {
        Asist.serveSource("function->()");
    }

    @Test(expected = IllegalStateException.class)
    public void adding_notification_with_duplicated_id_should_cause_an_error() {
        Asist.serveSource("notify test5 in hour 'test' with os_notification");
        Asist.serveSource("notify test5 in minute 'test' with os_notification");
    }

    @Test
    public void adding_notification_with_single_time_type_should_be_fine() {
        boolean date = Asist.getNotificationMap().get("test5").getDate() == null;
        boolean seconds = Asist.getNotificationMap().get("test5").getSeconds() == null;
        boolean minutes = Asist.getNotificationMap().get("test5").getMinutes() == null;
        boolean hours = Asist.getNotificationMap().get("test5").getHours() != null
                && Asist.getNotificationMap().get("test5").getHours().equals(1 * 60 * 60 * 1000);
        assertEquals(date && seconds && minutes && hours, true);
    }

    @Test
    public void adding_notification_with_time_precisely_should_be_fine() {
        Asist.serveSource("notify test6 on 14/40 12/12/2020 'test from past' with os_notification");
        boolean date = Asist.getNotificationMap().get("test6").getDate() != null
                && Asist.getNotificationMap().get("test6").getDate().toString().equals("Sat Dec 12 14:40:00 CET 2020");
        boolean seconds = Asist.getNotificationMap().get("test6").getSeconds() == null;
        boolean minutes = Asist.getNotificationMap().get("test6").getMinutes() == null;
        boolean hours = Asist.getNotificationMap().get("test6").getHours() == null;
        assertEquals(date && seconds && minutes && hours, true);
    }

    @Test
    public void added_notification_message_should_be_fine() {
        assertEquals(Asist.getNotificationMap().get("test6").getMessage(), "test from past");
    }

    @Test
    public void added_notification_title_should_be_fine() {
        assertEquals(Asist.getNotificationMap().get("test6").getTitle(), "test6");
    }
}
