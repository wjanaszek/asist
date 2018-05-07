package pl.edu.pw.elka.wjanaszek.asist.domain.variable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum MultiplicationOperator {
    MULTIPLY("*"),
    DIVIDE(":");

    @Getter
    String text;

    public static MultiplicationOperator fromString(String text) {
        for (MultiplicationOperator s : MultiplicationOperator.values()) {
            if (s.text.equalsIgnoreCase(text)) {
                return s;
            }
        }
        throw new IllegalArgumentException(text + " is invalid header name");
    }
}
