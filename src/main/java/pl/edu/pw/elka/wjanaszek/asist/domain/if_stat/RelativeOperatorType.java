package pl.edu.pw.elka.wjanaszek.asist.domain.if_stat;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum RelativeOperatorType {
    MORE(">"),
    LESS("<"),
    EQUAL("=="),
    NOT_EQUAL("!="),
    LESS_OR_EQUAL("<="),
    MORE_OR_EQUAL(">=");


    @Getter
    String text;

    public static RelativeOperatorType fromString(String text) {
        for (RelativeOperatorType s : RelativeOperatorType.values()) {
            if (s.text.equalsIgnoreCase(text)) {
                return s;
            }
        }
        throw new IllegalArgumentException(text + " is invalid header name");
    }
}
