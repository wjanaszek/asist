package pl.edu.pw.elka.wjanaszek.asist.domain.notification;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import pl.edu.pw.elka.wjanaszek.asist.domain.Statement;
import pl.edu.pw.elka.wjanaszek.asist.domain.StatementType;

@Getter
@Setter
@Slf4j
@ToString
@EqualsAndHashCode
public class NotificationStatement extends Statement {
    private String identifier;
    private FiredWhen firedWhen;
    private String message;
    private String actionType;

    public NotificationStatement(String identifier, FiredWhen firedWhen, String message, String actionType) {
        super(StatementType.NOTIFICATION_STATEMENT);
        this.identifier = identifier;
        this.firedWhen = firedWhen;
        this.message = message;
        this.actionType = actionType;
    }
}
