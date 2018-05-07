package pl.edu.pw.elka.wjanaszek.asist.domain.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum SingleTimeType {
    SECOND("SEC"),
    MINUTE("MIN"),
    HOUR("HOUR");

    @Getter
    String text;

    public static SingleTimeType fromString(String text) {
        for (SingleTimeType s : SingleTimeType.values()) {
            if (s.text.equalsIgnoreCase(text)) {
                return s;
            }
        }
        throw new IllegalArgumentException(text + " is invalid header name");
    }
}
