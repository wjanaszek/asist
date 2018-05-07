package pl.edu.pw.elka.wjanaszek.asist.domain.notification;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class FiredWhen {
    private TimeBased timeBased;
    private TimePrecisely timePrecisely;
    private OnEvent onEvent;
}
