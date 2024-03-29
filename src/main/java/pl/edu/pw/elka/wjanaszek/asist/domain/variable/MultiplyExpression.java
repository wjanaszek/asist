package pl.edu.pw.elka.wjanaszek.asist.domain.variable;

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
public class MultiplyExpression {
    private List<AtomExpression> atomExpressionList;
    private List<MultiplicationOperator> operatorList;
    private String value;
}
