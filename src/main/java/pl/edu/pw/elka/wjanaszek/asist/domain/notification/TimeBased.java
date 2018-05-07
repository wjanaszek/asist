package pl.edu.pw.elka.wjanaszek.asist.domain.notification;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class TimeBased {
    private TimeBasedType type;
    private Integer value;
    private SingleTimeType singleTimeType;
    private PluralTimeType pluralTimeType;
}
