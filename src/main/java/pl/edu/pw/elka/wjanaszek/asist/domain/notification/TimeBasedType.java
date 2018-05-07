package pl.edu.pw.elka.wjanaszek.asist.domain.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum TimeBasedType {
    EVERY("EVERY"),
    IN("IN");

    @Getter
    String text;

    public static TimeBasedType fromString(String text) {
        for (TimeBasedType s : TimeBasedType.values()) {
            if (s.text.equalsIgnoreCase(text)) {
                return s;
            }
        }
        throw new IllegalArgumentException(text + " is invalid header name");
    }
}
