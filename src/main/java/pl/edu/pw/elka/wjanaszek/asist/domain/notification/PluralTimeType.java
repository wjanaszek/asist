package pl.edu.pw.elka.wjanaszek.asist.domain.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum PluralTimeType {
    SECONDS("SECS"),
    MINUTES("MINS"),
    HOURS("HOURS");

    @Getter
    String text;

    public static PluralTimeType fromString(String text) {
        for (PluralTimeType s : PluralTimeType.values()) {
            if (s.text.equalsIgnoreCase(text)) {
                return s;
            }
        }
        throw new IllegalArgumentException(text + " is invalid header name");
    }
}
