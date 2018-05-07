package pl.edu.pw.elka.wjanaszek.asist.domain.variable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.edu.pw.elka.wjanaszek.asist.domain.StatementType;

@AllArgsConstructor
public enum AdditionOperator {
    ADD("+"),
    REMOVE("-");

    @Getter
    String text;

    public static AdditionOperator fromString(String text) {
        for (AdditionOperator s : AdditionOperator.values()) {
            if (s.text.equalsIgnoreCase(text)) {
                return s;
            }
        }
        throw new IllegalArgumentException(text + " is invalid header name");
    }
}
