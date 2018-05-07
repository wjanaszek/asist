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
    List<AtomExpression> atomExpressionList;
    List<MultiplicationOperator> operatorList;
}

//if ((a*3 + 2 + 5 - 2) == 5) then
//        c
//        endif