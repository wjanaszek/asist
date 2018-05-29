package pl.edu.pw.elka.wjanaszek.asist.domain.if_stat;

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
public class Term {
    // list of "and" connected factors
    private List<Factor> factorList;
    private Boolean value;
}
