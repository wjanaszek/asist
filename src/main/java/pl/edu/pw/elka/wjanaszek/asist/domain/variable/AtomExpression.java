package pl.edu.pw.elka.wjanaszek.asist.domain.variable;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class AtomExpression {
    private String identifier;
    private Integer value;
}
