package pl.edu.pw.elka.wjanaszek.asist.domain.if_stat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import pl.edu.pw.elka.wjanaszek.asist.domain.variable.ArithmeticOperation;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class RelativeFactor {
    private RelativeOperatorType operatorType;
    private ArithmeticOperation leftArithmetic;
    private ArithmeticOperation rightArithmetic;
    private String leftVariable;
    private String rightVariable;
    private Integer leftInteger;
    private Integer rightInteger;
}
