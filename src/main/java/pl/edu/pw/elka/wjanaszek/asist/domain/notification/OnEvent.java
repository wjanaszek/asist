package pl.edu.pw.elka.wjanaszek.asist.domain.notification;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Getter
@Setter
@Slf4j
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class OnEvent {
    private List<String> identifier;
}
