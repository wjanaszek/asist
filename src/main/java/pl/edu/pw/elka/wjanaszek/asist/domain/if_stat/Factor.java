package pl.edu.pw.elka.wjanaszek.asist.domain.if_stat;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import pl.edu.pw.elka.wjanaszek.asist.domain.variable.ArithmeticOperation;
import pl.edu.pw.elka.wjanaszek.asist.domain.variable.ObjectProperties;

@Getter
@Setter
@Slf4j
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Factor {
    private String identifier;
    private String notIdentifier;
    private ArithmeticOperation arithmeticOperation;
    private Integer integer;
    private ObjectProperties objectProperties;
    private RelativeFactor relativeFactor;
    private Boolean value;
}
