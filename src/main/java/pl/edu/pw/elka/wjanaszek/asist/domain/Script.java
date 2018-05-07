package pl.edu.pw.elka.wjanaszek.asist.domain;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@Slf4j
@ToString
@EqualsAndHashCode
public class Script {
    private List<Statement> statementList;
}
