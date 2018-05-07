package pl.edu.pw.elka.wjanaszek.asist.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum StatementType {
    FUNCTION_CALL("FUNCTION"),
    IF_STATEMENT("IF"),
    IMPORT_STATEMENT("IMPORT"),
    NOTIFICATION_STATEMENT("NOTIFICATION"),
    SEARCH_FUNCTION("SEARCH"),
    VARIABLE_OR_ASSIGNMENT("VARIABLE_OR_ASSIGNMENT");

    @Getter
    String text;

    public static StatementType fromString(String text) {
        for (StatementType s : StatementType.values()) {
            if (s.text.equalsIgnoreCase(text)) {
                return s;
            }
        }
        throw new IllegalArgumentException(text + " is invalid header name");
    }
}
