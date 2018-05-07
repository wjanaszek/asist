package pl.edu.pw.elka.wjanaszek.asist.domain.if_stat;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import pl.edu.pw.elka.wjanaszek.asist.domain.function.FunctionCall;
import pl.edu.pw.elka.wjanaszek.asist.domain.notification.NotificationStatement;
import pl.edu.pw.elka.wjanaszek.asist.domain.search.SearchFunction;
import pl.edu.pw.elka.wjanaszek.asist.domain.variable.VariableOrAssignment;

@Getter
@Setter
@Slf4j
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Instruction {
    private SearchFunction searchFunction;
    private VariableOrAssignment variableOrAssignment;
    private IfStatement ifStatement;
    private NotificationStatement notificationStatement;
    private FunctionCall functionCall;
}
